docker run -ti -v `pwd`/sp-samples-1k.log:/sp-samples-1k.log      \
     fluent/fluent-bit:1.4                                          \
     /fluent-bit/bin/fluent-bit -R /fluent-bit/etc/parsers.conf     \
                                -i tail -p path=/sp-samples-1k.log  \
                                        -p parser=json              \
                                -o stdout -f 1
