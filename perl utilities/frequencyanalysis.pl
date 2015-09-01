use strict;
use warnings;

my $filename = '5groupeddecimal.txt';
my $outputfilename = 'frequencyanalysis';
my %freq;

open(my $fr, ">", $outputfilename) or die;
my $binvalue = '';
if (open(my $fh, '<', $filename)) {
  while (my $row = <$fh>) {
    chomp $row;

    $freq{$row}++


    #print "$group1hex\n"."$group2hex\n"."$group3hex\n";
    #print $fr "$group1hex\n"."$group2hex\n"."$group3hex\n";
  }
  print $_, " ", $freq{$_}, "\n" for sort keys %freq;
  print $fr $_, " ", $freq{$_}, "\n" for sort keys %freq;
} else {
  warn "Could not open file '$filename' $!";
}