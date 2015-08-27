use strict;
use warnings;
 
my $filename = 'strippedbinary.txt';
my $outputfilename = 'strippedhex.txt';
my $hexvalue = "";
open(my $fr, ">", $outputfilename) or die;
my $binvalue = '';
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;
      $binvalue = $row;
      $hexvalue = sprintf("%X", oct( "0b$binvalue" ) );
      if(length($hexvalue)==6){
      	$hexvalue = "0".$hexvalue;
      }

	    print "$hexvalue\n";
	    print $fr "$hexvalue\n";
  }
} else {
  warn "Could not open file '$filename' $!";
}