use strict;
use warnings;
 
my $filename = 'secondposthex.txt';
my $outputfilename = 'secondpost.txt';
my $hexvalue = "";
open(my $fr, ">", $outputfilename) or die;
my $longstring;
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;
    my @groups = split / /, $row;
    foreach my $group(@groups){
	    print $fr "$group\n";
	}
    $longstring = $longstring . $row;
  }
  print $fr $longstring;
} else {
  warn "Could not open file '$filename' $!";
}