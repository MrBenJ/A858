use strict;
use warnings;

my $filename = 'binary.txt';
my $outputfilename = '5groupeddecimal.txt';

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

    my $group1 = "0".substr($binvalue,0,5);

    my $group2 = "0".substr($binvalue,5,5);
    my $group3 = "0".substr($binvalue,10,5);

    my $group1hex = oct( "0b$group1" );
    my $group2hex = oct( "0b$group2" );
    my $group3hex = oct( "0b$group3" );


    print "$group1hex\n"."$group2hex\n"."$group3hex\n";
    print $fr "$group1hex\n"."$group2hex\n"."$group3hex\n";
  }
} else {
  warn "Could not open file '$filename' $!";
}