<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        
<title>Retail Price Pro Table Result</title>
</head>
<body>
<?php


//first we get the parameter
$userName = 'bfoucque';
if ($_POST["per_page"] == null)
{
    //we thake 10 per page
    $postData['per_page'] = 10;
    
}
 else {
    $postData['per_page'] = $_POST["per_page"];
    
}
//Page Number

if ($_POST["page_number"] == null)
{
    $postData['page_number'] = 1;
}
 else {
    $postData['page_number'] = $_POST["page_number"];
}

//filter_site
echo $_POST["filter_site"];
if ($_POST["filter_site"] != null)
{
  
    $postData['filter_site'] = $_POST["filter_site"];
    //echo $_POST["filter_site"]
    echo 'ici';
}

//filter_site
if ($_POST["filter_brand"] != null)
{

    $postData['filter_brand'] = $_POST["filter_brand"];
    //echo $_POST["filter_site"];
}

//filter_site
if ($_POST["filter_product"] != null)
{

    $postData['filter_product'] = $_POST["filter_product"];
    //echo $_POST["filter_site"];
}

//filter_site
if ($_POST["filter_size"] != null)
{

    $postData['filter_size'] = $_POST["filter_size"];
    //echo $_POST["filter_site"];
}



//we call the wss then redirect
$address = 'https://atduxir3n3.execute-api.us-east-1.amazonaws.com/production/rpp/pagination/get-page';

$postData['user_name'] = $userName;
$postData['order_by'] = $_POST["order_by"];
//echo var_dump($postData);
$data_string = json_encode($postData);

$ch = curl_init();

//the token
curl_setopt($ch, CURLOPT_URL, $address);
//curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
curl_setopt($ch, CURLOPT_POSTFIELDS, $data_string);
curl_setopt( $ch, CURLOPT_HTTPHEADER, array('Content-Type:application/json','x-api-key:PuUPP27Dln1eNVnGqVvhK9JuwTdh6DYC4gb48Hkq'));
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
$resultCall = curl_exec($ch);

//echo($resultCall);
curl_close($ch);
$resultCallJson = json_decode($resultCall);
//var_dump($resultCallJson->rows);

echo "<b>Current information</b><br>";

$myUserName = $resultCallJson->meta->user_name; 
echo "User: " .  $myUserName . '<br>';

//we get the info from meta
$myPageNumber = $resultCallJson->meta->current_page; 
echo "Page number: " .  $myPageNumber . '<br>';

$myOffSet = $resultCallJson->meta->from;  
echo "Start Line: " . $myOffSet . '<br>';

$to  = $resultCallJson->meta->to;
echo "End  Line: " . $to. '<br>';

$myNumberOfPages = $resultCallJson->meta->last_page;
echo "Number of Page: " .  $myNumberOfPages  . '<br>';

$myPerPage = $resultCallJson->meta->per_page;  
echo "Number of Record per page: " .  $myPerPage. '<br>';

$myNumberOfRows  = $resultCallJson->meta->total; 
echo "Total number Record: " .  $myNumberOfRows. '<br>';

$myOrderBy  = $resultCallJson->meta->order_by; 
echo "Order by: " .  $myOrderBy. '<br>';

$myFilterBrand  = $resultCallJson->meta->selected_brand; 
echo "Brand filter by: " .  $myFilterBrand. '<br>';

$myFilterProduct  = $resultCallJson->meta->selected_product; 
echo "Product filter by: " .  $myFilterProduct. '<br>';

$myFilterSize  = $resultCallJson->meta->selected_size; 
echo "Size filter by: " .  $myFilterSize. '<br>';

$myFilterSite  = $resultCallJson->meta->selected_site; 
echo "Site filter by: " .  $myFilterSite. '<br>';

//we create the form
echo "<br><br><b>Target information</b><br>";
echo '<form action="tablerpp.php" method="post">';
echo 'Target number per page: <input type="number" value="' . $myPerPage . '"  name="per_page" min="1" max="100"><br>';  
echo 'Target page: <input type="number" value="' . $myPageNumber . '" name="page_number" min="1" max="' . max($myNumberOfPages,1) . '"><br>';
//we put the order by
echo 'Sort By: <select type="text" name="order_by">';
//var_dump($resultCallJson->meta->order_by_list);
foreach($resultCallJson->meta->order_by_list as $mydata2 => $jsons)
{
   //echo ;
    //foreach($jsons as $key => $value) {
     //    echo $value; // This will show jsut the value f each key like "var1" will print 9
                       // And then goes print 16,16,8 ...
    //}
    echo '<option value="'. $mydata2 . '">'. $mydata2 . '</option>';

}  

echo '</select><br>';

//FILTER
echo '<br><b>FILTER</b><br>';
//we put the PRODUCT
echo 'Product List: <select type="text" name="filter_product[]" multiple>';
//var_dump($resultCallJson->meta->product_list);
foreach($resultCallJson->meta->product_list as $mydataProduct => $jsons)
{

    echo '<option value="'. $jsons . '" >'. $jsons . '</option>';

}  
echo '</select><br>';

//we put the BRAND
echo 'Brand List: <select type="text" name="filter_brand[]" multiple>';
//var_dump($resultCallJson->meta->product_list);
foreach($resultCallJson->meta->brand_list as $mydataProduct => $jsons)
{

    echo '<option value="'. $jsons . '" >'. $jsons . '</option>';

}  
echo '</select><br>';

//we put the SIZE
echo 'Size List: <select type="text" name="filter_size[]" multiple>';
//var_dump($resultCallJson->meta->product_list);
foreach($resultCallJson->meta->size_list as $mydataProduct => $jsons)
{

    echo '<option value="'. $jsons . '" >'. $jsons . '</option>';

}  
echo '</select><br>';

//we put the SITE
echo 'Site List: <select type="text" name="filter_site[]" multiple>';
//var_dump($resultCallJson->meta->product_list);
foreach($resultCallJson->meta->site_list as $mydataProduct => $jsons)
{

    echo '<option value="'. $jsons . '" >'. $jsons . '</option>';

}  
echo '</select><br>';

//SUBMIT
echo "<br>";
echo '<input type="submit" value="Submit"> ';
echo '</form>';

echo "<br>";

//first
echo '<form action="tablerpp.php" method="post">';
echo '<input type="hidden" value="' . $myPerPage . '"  name="per_page">';  
echo '<input type="hidden" value="1" name="page_number">';
//we put the order by
echo '<input type="hidden" value="' . $myOrderBy . '" name="order_by">';

echo '<input type="submit" value="FIRST"> ';
echo '</form>';


//LAST
echo '<form action="tablerpp.php" method="post">';
echo '<input type="hidden" value="' . $myPerPage . '"  name="per_page">';  
echo '<input type="hidden" value="' . $myNumberOfPages . '" name="page_number">';
//we put the order by
echo '<input type="hidden" value="' . $myOrderBy . '" name="order_by">';

echo '<input type="submit" value="LAST"> ';
echo '</form>';

echo "<br><br><br>";

//we build the table
echo('<table>');//echo('<table border = 2>');
//we build the header

echo('<tr>');
foreach($resultCallJson->meta->column_name as $mydata)
{
    echo '<th>'. $mydata . '</th>';
}       
echo  "\n";
//we build the table by itsef

foreach($resultCallJson->rows as $mydata)
{
    echo('</tr>');
    
    
    //var_dump($mydata);
    foreach($mydata as $values)
         {
        echo '<td>';      
        echo $values;
        echo '</td>';
         }
    
    echo('</tr>');
    echo  "\n";
}       



echo('</table>');


?>
</body>
</html>
