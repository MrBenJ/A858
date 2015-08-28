use strict;
use warnings;

my $filename = 'binary.txt';
my $outputfilename = '5groupedbinary.txt';

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

    my $group1 = substr($binvalue,0,5);
    my $group2 = substr($binvalue,5,5);
    my $group3 = substr($binvalue,10,5);

    print "$group1 "."$group2 "."$group3\n";
    print $fr "$group1 "."$group2 "."$group3\n";
  }
} else {
  warn "Could not open file '$filename' $!";
}