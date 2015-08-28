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

    my $group1 = "0".substr($binvalue,0,5);

    my $group2 = "0".substr($binvalue,5,5);
    my $group3 = "0".substr($binvalue,10,5);

    my $group1hex = sprintf("%X", oct( "0b$group1" ) );
    my $group2hex = sprintf("%X", oct( "0b$group2" ) );
    my $group3hex = sprintf("%X", oct( "0b$group3" ) );

    if(length($group1hex)==1){
        $group1hex = "0".$group1hex;
      }

      if(length($group2hex)==1){
        $group2hex = "0".$group2hex;
      }

      if(length($group3hex)==1){
        $group3hex = "0".$group3hex;
      }

    print "$group1hex"."$group2hex"."$group3hex";
    print $fr "$group1hex"."$group2hex"."$group3hex";
  }
} else {
  warn "Could not open file '$filename' $!";
}