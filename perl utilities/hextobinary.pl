use strict;
use warnings;
 
my $filename = 'hex.txt';
my $outputfilename = 'binary.txt';
open(my $fr, ">", $outputfilename) or die;
my $binvalue = '';
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;
    my @groups = split / /, $row;
    foreach my $group(@groups){
	    $binvalue = sprintf( "%b", hex( $group ) );

	    print "$binvalue\n";
	    print $fr "$binvalue\n";
	}
  }
} else {
  warn "Could not open file '$filename' $!";
}