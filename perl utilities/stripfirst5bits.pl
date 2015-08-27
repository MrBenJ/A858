use strict;
use warnings;

my $filename = 'binary.txt';
my $outputfilename = 'strippedbinary.txt';

open(my $fr, ">", $outputfilename) or die;
my $binvalue = '';
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;

    #remove first 5 chars
    $binvalue = substr($row,5);

    #remove 12th char
    $binvalue = substr($binvalue,0,11) . substr($binvalue,12);

    #remove 19th char
    $binvalue = substr($binvalue,0,18) . substr($binvalue,19);

    print "$binvalue\n";
    print $fr "$binvalue\n";
  }
} else {
  warn "Could not open file '$filename' $!";
}