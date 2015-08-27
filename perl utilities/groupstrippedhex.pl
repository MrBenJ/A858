use strict;
use warnings;
 
my $filename = 'strippedhex.txt';
my $outputfilename = 'groupedstrippedhex.txt';
my $hexvalue = "";
open(my $fr, ">", $outputfilename) or die;
my $longstring;
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;
    $longstring = $longstring . $row;
  }
  print $fr $longstring;
} else {
  warn "Could not open file '$filename' $!";
}