# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Docker Scan plugin for the Docker CLI"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   components/engine/LICENSE
#   components/engine/libnetwork/client/mflag/LICENSE
#   components/engine/vendor/go.opencensus.io/LICENSE
#   components/engine/vendor/golang.org/x/sys/LICENSE
#   components/engine/vendor/golang.org/x/crypto/LICENSE
#   components/engine/vendor/golang.org/x/net/LICENSE
#   components/engine/vendor/golang.org/x/time/LICENSE
#   components/engine/vendor/golang.org/x/oauth2/LICENSE
#   components/engine/vendor/golang.org/x/text/LICENSE
#   components/engine/vendor/golang.org/x/sync/LICENSE
#   components/engine/vendor/github.com/vbatts/tar-split/LICENSE
#   components/engine/vendor/github.com/hashicorp/go-memdb/LICENSE
#   components/engine/vendor/github.com/hashicorp/serf/LICENSE
#   components/engine/vendor/github.com/hashicorp/memberlist/LICENSE
#   components/engine/vendor/github.com/hashicorp/consul/LICENSE
#   components/engine/vendor/github.com/hashicorp/go-sockaddr/LICENSE
#   components/engine/vendor/github.com/hashicorp/golang-lru/LICENSE
#   components/engine/vendor/github.com/hashicorp/go-immutable-radix/LICENSE
#   components/engine/vendor/github.com/hashicorp/go-multierror/LICENSE
#   components/engine/vendor/github.com/hashicorp/errwrap/LICENSE
#   components/engine/vendor/github.com/hashicorp/go-msgpack/LICENSE
#   components/engine/vendor/github.com/tinylib/msgp/LICENSE
#   components/engine/vendor/github.com/gorilla/mux/LICENSE
#   components/engine/vendor/github.com/modern-go/concurrent/LICENSE
#   components/engine/vendor/github.com/modern-go/reflect2/LICENSE
#   components/engine/vendor/github.com/samuel/go-zookeeper/LICENSE
#   components/engine/vendor/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE
#   components/engine/vendor/github.com/grpc-ecosystem/go-grpc-prometheus/LICENSE
#   components/engine/vendor/github.com/grpc-ecosystem/grpc-opentracing/LICENSE
#   components/engine/vendor/github.com/cloudflare/cfssl/LICENSE
#   components/engine/vendor/github.com/cyphar/filepath-securejoin/LICENSE
#   components/engine/vendor/github.com/golang/protobuf/LICENSE
#   components/engine/vendor/github.com/golang/gddo/LICENSE
#   components/engine/vendor/github.com/golang/groupcache/LICENSE
#   components/engine/vendor/github.com/RackSec/srslog/LICENSE
#   components/engine/vendor/github.com/ishidawataru/sctp/GO_LICENSE
#   components/engine/vendor/github.com/ishidawataru/sctp/LICENSE
#   components/engine/vendor/github.com/deckarep/golang-set/LICENSE
#   components/engine/vendor/github.com/opencontainers/runtime-spec/LICENSE
#   components/engine/vendor/github.com/opencontainers/image-spec/LICENSE
#   components/engine/vendor/github.com/opencontainers/selinux/LICENSE
#   components/engine/vendor/github.com/opencontainers/runc/LICENSE
#   components/engine/vendor/github.com/opencontainers/go-digest/LICENSE.docs
#   components/engine/vendor/github.com/opencontainers/go-digest/LICENSE
#   components/engine/vendor/github.com/pkg/errors/LICENSE
#   components/engine/vendor/github.com/urfave/cli/LICENSE
#   components/engine/vendor/github.com/docker/libtrust/LICENSE
#   components/engine/vendor/github.com/docker/go-metrics/LICENSE.docs
#   components/engine/vendor/github.com/docker/go-metrics/LICENSE
#   components/engine/vendor/github.com/docker/go-connections/LICENSE
#   components/engine/vendor/github.com/docker/go-events/LICENSE
#   components/engine/vendor/github.com/docker/libkv/LICENSE.code
#   components/engine/vendor/github.com/docker/libkv/LICENSE.docs
#   components/engine/vendor/github.com/docker/go-units/LICENSE
#   components/engine/vendor/github.com/docker/distribution/LICENSE
#   components/engine/vendor/github.com/docker/swarmkit/LICENSE
#   components/engine/vendor/github.com/bits-and-blooms/bitset/LICENSE
#   components/engine/vendor/github.com/googleapis/gax-go/LICENSE
#   components/engine/vendor/github.com/moby/ipvs/LICENSE
#   components/engine/vendor/github.com/moby/sys/symlink/LICENSE.BSD
#   components/engine/vendor/github.com/moby/sys/symlink/LICENSE.APACHE
#   components/engine/vendor/github.com/moby/term/LICENSE
#   components/engine/vendor/github.com/moby/buildkit/LICENSE
#   components/engine/vendor/github.com/moby/locker/LICENSE
#   components/engine/vendor/github.com/opentracing/opentracing-go/LICENSE
#   components/engine/vendor/github.com/mistifyio/go-zfs/LICENSE
#   components/engine/vendor/github.com/opentracing-contrib/go-stdlib/LICENSE
#   components/engine/vendor/github.com/inconshreveable/mousetrap/LICENSE
#   components/engine/vendor/github.com/imdario/mergo/LICENSE
#   components/engine/vendor/github.com/vishvananda/netlink/LICENSE
#   components/engine/vendor/github.com/vishvananda/netns/LICENSE
#   components/engine/vendor/github.com/matttproud/golang_protobuf_extensions/LICENSE
#   components/engine/vendor/github.com/prometheus/client_golang/LICENSE
#   components/engine/vendor/github.com/prometheus/common/LICENSE
#   components/engine/vendor/github.com/prometheus/procfs/LICENSE
#   components/engine/vendor/github.com/prometheus/client_model/LICENSE
#   components/engine/vendor/github.com/google/go-cmp/LICENSE
#   components/engine/vendor/github.com/google/uuid/LICENSE
#   components/engine/vendor/github.com/jmespath/go-jmespath/LICENSE
#   components/engine/vendor/github.com/spf13/pflag/LICENSE
#   components/engine/vendor/github.com/spf13/cobra/LICENSE.txt
#   components/engine/vendor/github.com/klauspost/compress/LICENSE
#   components/engine/vendor/github.com/klauspost/compress/snappy/LICENSE
#   components/engine/vendor/github.com/fsnotify/fsnotify/LICENSE
#   components/engine/vendor/github.com/gofrs/flock/LICENSE
#   components/engine/vendor/github.com/sean-/seed/LICENSE
#   components/engine/vendor/github.com/gogo/protobuf/LICENSE
#   components/engine/vendor/github.com/gogo/googleapis/LICENSE
#   components/engine/vendor/github.com/syndtr/gocapability/LICENSE
#   components/engine/vendor/github.com/containerd/fifo/LICENSE
#   components/engine/vendor/github.com/containerd/continuity/LICENSE
#   components/engine/vendor/github.com/containerd/typeurl/LICENSE
#   components/engine/vendor/github.com/containerd/go-runc/LICENSE
#   components/engine/vendor/github.com/containerd/ttrpc/LICENSE
#   components/engine/vendor/github.com/containerd/console/LICENSE
#   components/engine/vendor/github.com/containerd/cgroups/LICENSE
#   components/engine/vendor/github.com/containerd/containerd/LICENSE
#   components/engine/vendor/github.com/tonistiigi/fsutil/LICENSE
#   components/engine/vendor/github.com/coreos/pkg/LICENSE
#   components/engine/vendor/github.com/coreos/go-systemd/LICENSE
#   components/engine/vendor/github.com/coreos/go-systemd/v22/LICENSE
#   components/engine/vendor/github.com/miekg/dns/LICENSE
#   components/engine/vendor/code.cloudfoundry.org/clock/LICENSE
#   components/engine/vendor/google.golang.org/api/LICENSE
#   components/engine/vendor/gotest.tools/v3/LICENSE
#   components/engine/vendor/gotest.tools/v3/internal/difflib/LICENSE
#   components/packaging/LICENSE
#   components/cli/LICENSE
#   components/cli/vendor/go.opencensus.io/LICENSE
#   components/cli/vendor/k8s.io/klog/LICENSE
#   components/cli/vendor/golang.org/x/sys/LICENSE
#   components/cli/vendor/golang.org/x/term/LICENSE
#   components/cli/vendor/golang.org/x/crypto/LICENSE
#   components/cli/vendor/golang.org/x/net/LICENSE
#   components/cli/vendor/golang.org/x/time/LICENSE
#   components/cli/vendor/golang.org/x/oauth2/LICENSE
#   components/cli/vendor/golang.org/x/text/LICENSE
#   components/cli/vendor/golang.org/x/sync/LICENSE
#   components/cli/vendor/github.com/hashicorp/golang-lru/LICENSE
#   components/cli/vendor/github.com/gorilla/mux/LICENSE
#   components/cli/vendor/github.com/modern-go/concurrent/LICENSE
#   components/cli/vendor/github.com/modern-go/reflect2/LICENSE
#   components/cli/vendor/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE
#   components/cli/vendor/github.com/grpc-ecosystem/grpc-gateway/LICENSE.txt
#   components/cli/vendor/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/LICENSE
#   components/cli/vendor/github.com/grpc-ecosystem/grpc-opentracing/LICENSE
#   components/cli/vendor/github.com/xeipuuv/gojsonreference/LICENSE-APACHE-2.0.txt
#   components/cli/vendor/github.com/xeipuuv/gojsonschema/LICENSE-APACHE-2.0.txt
#   components/cli/vendor/github.com/xeipuuv/gojsonpointer/LICENSE-APACHE-2.0.txt
#   components/cli/vendor/github.com/golang/protobuf/LICENSE
#   components/cli/vendor/github.com/golang/glog/LICENSE
#   components/cli/vendor/github.com/golang/groupcache/LICENSE
#   components/cli/vendor/github.com/evanphx/json-patch/LICENSE
#   components/cli/vendor/github.com/opencontainers/image-spec/LICENSE
#   components/cli/vendor/github.com/opencontainers/runc/LICENSE
#   components/cli/vendor/github.com/opencontainers/go-digest/LICENSE.docs
#   components/cli/vendor/github.com/opencontainers/go-digest/LICENSE
#   components/cli/vendor/github.com/pkg/errors/LICENSE
#   components/cli/vendor/github.com/docker/go-metrics/LICENSE.docs
#   components/cli/vendor/github.com/docker/go-metrics/LICENSE
#   components/cli/vendor/github.com/docker/go-connections/LICENSE
#   components/cli/vendor/github.com/docker/go-events/LICENSE
#   components/cli/vendor/github.com/docker/docker/LICENSE
#   components/cli/vendor/github.com/docker/go-units/LICENSE
#   components/cli/vendor/github.com/docker/go/LICENSE
#   components/cli/vendor/github.com/docker/compose-on-kubernetes/LICENSE
#   components/cli/vendor/github.com/docker/distribution/LICENSE
#   components/cli/vendor/github.com/docker/swarmkit/LICENSE
#   components/cli/vendor/github.com/googleapis/gnostic/LICENSE
#   components/cli/vendor/github.com/moby/sys/symlink/LICENSE.BSD
#   components/cli/vendor/github.com/moby/sys/symlink/LICENSE.APACHE
#   components/cli/vendor/github.com/moby/term/LICENSE
#   components/cli/vendor/github.com/moby/buildkit/LICENSE
#   components/cli/vendor/github.com/opentracing/opentracing-go/LICENSE
#   components/cli/vendor/github.com/inconshreveable/mousetrap/LICENSE
#   components/cli/vendor/github.com/imdario/mergo/LICENSE
#   components/cli/vendor/github.com/matttproud/golang_protobuf_extensions/LICENSE
#   components/cli/vendor/github.com/prometheus/client_golang/LICENSE
#   components/cli/vendor/github.com/prometheus/common/LICENSE
#   components/cli/vendor/github.com/prometheus/procfs/LICENSE
#   components/cli/vendor/github.com/prometheus/client_model/LICENSE
#   components/cli/vendor/github.com/google/go-cmp/LICENSE
#   components/cli/vendor/github.com/spf13/pflag/LICENSE
#   components/cli/vendor/github.com/spf13/cobra/LICENSE.txt
#   components/cli/vendor/github.com/gofrs/flock/LICENSE
#   components/cli/vendor/github.com/gogo/protobuf/LICENSE
#   components/cli/vendor/github.com/gogo/googleapis/LICENSE
#   components/cli/vendor/github.com/russross/blackfriday/v2/LICENSE.txt
#   components/cli/vendor/github.com/containerd/continuity/LICENSE
#   components/cli/vendor/github.com/containerd/typeurl/LICENSE
#   components/cli/vendor/github.com/containerd/console/LICENSE
#   components/cli/vendor/github.com/containerd/cgroups/LICENSE
#   components/cli/vendor/github.com/containerd/containerd/LICENSE
#   components/cli/vendor/github.com/tonistiigi/fsutil/LICENSE
#   components/cli/vendor/github.com/tonistiigi/go-rosetta/LICENSE
#   components/cli/vendor/github.com/theupdateframework/notary/LICENSE
#   components/cli/vendor/github.com/theupdateframework/notary/tuf/LICENSE
#   components/cli/vendor/github.com/miekg/pkcs11/LICENSE
#   components/cli/vendor/sigs.k8s.io/yaml/LICENSE
#   components/cli/vendor/gopkg.in/yaml.v2/LICENSE
#   components/cli/vendor/gopkg.in/yaml.v2/LICENSE.libyaml
#   components/cli/vendor/gopkg.in/inf.v0/LICENSE
#   components/cli/vendor/gotest.tools/v3/LICENSE
#   components/cli/vendor/gotest.tools/v3/internal/difflib/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT & BSD-2-Clause & Apache-2.0 & ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9740d093a080530b5c5c6573df9af45a \
                    file://components/engine/LICENSE;md5=4859e97a9c7780e77972d989f0823f28 \
                    file://components/engine/contrib/busybox/LICENSE;md5=17a4ce90fb4cd910059b218cd9ed21c0 \
                    file://components/engine/internal/test/suite/testify.LICENSE;md5=d4c9e9b2abd3afaebed1524a9a77b937 \
                    file://components/engine/libnetwork/client/mflag/LICENSE;md5=93a886692b8ad7b283b1198d516fb353 \
                    file://components/engine/vendor/go.opencensus.io/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
                    file://components/engine/vendor/go.etcd.io/bbolt/LICENSE;md5=13b2a308eefa10d841e3bf2467dbe07a \
                    file://components/engine/vendor/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/github.com/vbatts/tar-split/LICENSE;md5=19cd0ecd0a6c26052aec628b72e72881 \
                    file://components/engine/vendor/github.com/hashicorp/go-memdb/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
                    file://components/engine/vendor/github.com/hashicorp/serf/LICENSE;md5=b278a92d2c1509760384428817710378 \
                    file://components/engine/vendor/github.com/hashicorp/memberlist/LICENSE;md5=b278a92d2c1509760384428817710378 \
                    file://components/engine/vendor/github.com/hashicorp/consul/LICENSE;md5=b278a92d2c1509760384428817710378 \
                    file://components/engine/vendor/github.com/hashicorp/go-sockaddr/LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
                    file://components/engine/vendor/github.com/hashicorp/golang-lru/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
                    file://components/engine/vendor/github.com/hashicorp/go-immutable-radix/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
                    file://components/engine/vendor/github.com/hashicorp/go-multierror/LICENSE;md5=d44fdeb607e2d2614db9464dbedd4094 \
                    file://components/engine/vendor/github.com/hashicorp/errwrap/LICENSE;md5=b278a92d2c1509760384428817710378 \
                    file://components/engine/vendor/github.com/hashicorp/go-msgpack/LICENSE;md5=3f4c936a1236aa7f17ca2a0b0ce4bfdd \
                    file://components/engine/vendor/github.com/tinylib/msgp/LICENSE;md5=37acb030ba070680be4a9fcb57f2735a \
                    file://components/engine/vendor/github.com/Azure/go-ansiterm/LICENSE;md5=6000442264015a23894024af9930539b \
                    file://components/engine/vendor/github.com/pelletier/go-toml/LICENSE;md5=dc9ea87a81f62b8871b2a4158edbfde6 \
                    file://components/engine/vendor/github.com/gorilla/mux/LICENSE;md5=33fa1116c45f9e8de714033f99edde13 \
                    file://components/engine/vendor/github.com/morikuni/aec/LICENSE;md5=86852eb2df591157c788f3ba889c8aec \
                    file://components/engine/vendor/github.com/modern-go/concurrent/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/modern-go/reflect2/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/samuel/go-zookeeper/LICENSE;md5=0d3bff996e9a8f99d8ba45af7c9f6da7 \
                    file://components/engine/vendor/github.com/BurntSushi/toml/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
                    file://components/engine/vendor/github.com/philhofer/fwd/LICENSE.md;md5=cfd452e4c91aa5191e3af8f3e4b67a9a \
                    file://components/engine/vendor/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
                    file://components/engine/vendor/github.com/grpc-ecosystem/go-grpc-prometheus/LICENSE;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
                    file://components/engine/vendor/github.com/grpc-ecosystem/grpc-opentracing/LICENSE;md5=e27f3702c0ce9855a5642e90f88757e4 \
                    file://components/engine/vendor/github.com/cloudflare/cfssl/LICENSE;md5=9bd1e7022303d9bbc29fda142f3e4fd0 \
                    file://components/engine/vendor/github.com/godbus/dbus/v5/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed \
                    file://components/engine/vendor/github.com/cyphar/filepath-securejoin/LICENSE;md5=8d322afab99e1998dbfcc712f94e824d \
                    file://components/engine/vendor/github.com/golang/protobuf/LICENSE;md5=939cce1ec101726fa754e698ac871622 \
                    file://components/engine/vendor/github.com/golang/gddo/LICENSE;md5=4c728948788b1a02f33ae4e906546eef \
                    file://components/engine/vendor/github.com/golang/groupcache/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/engine/vendor/github.com/RackSec/srslog/LICENSE;md5=b3cf073360f53fcbbc944d24704c83cb \
                    file://components/engine/vendor/github.com/bsphere/le_go/LICENSE;md5=b2e74ccd7e0bdee418d18cd3ee4117b8 \
                    file://components/engine/vendor/github.com/ishidawataru/sctp/GO_LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/engine/vendor/github.com/ishidawataru/sctp/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://components/engine/vendor/github.com/deckarep/golang-set/LICENSE;md5=00617792d571b24bacbf51216f308f32 \
                    file://components/engine/vendor/github.com/opencontainers/runtime-spec/LICENSE;md5=b355a61a394a504dacde901c958f662c \
                    file://components/engine/vendor/github.com/opencontainers/image-spec/LICENSE;md5=27ef03aa2da6e424307f102e8b42621d \
                    file://components/engine/vendor/github.com/opencontainers/selinux/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://components/engine/vendor/github.com/opencontainers/runc/LICENSE;md5=435b266b3899aa8a959f17d41c56def8 \
                    file://components/engine/vendor/github.com/opencontainers/go-digest/LICENSE.docs;md5=943c0794b61de2c8ca0d32947015508b \
                    file://components/engine/vendor/github.com/opencontainers/go-digest/LICENSE;md5=2d6fc0e85c3f118af64c85a78d56d3cf \
                    file://components/engine/vendor/github.com/pkg/errors/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a \
                    file://components/engine/vendor/github.com/urfave/cli/LICENSE;md5=ed9b539ed65d73926f30ff1f1587dc44 \
                    file://components/engine/vendor/github.com/docker/libtrust/LICENSE;md5=435b266b3899aa8a959f17d41c56def8 \
                    file://components/engine/vendor/github.com/docker/go-metrics/LICENSE.docs;md5=943c0794b61de2c8ca0d32947015508b \
                    file://components/engine/vendor/github.com/docker/go-metrics/LICENSE;md5=aadc30f9c14d876ded7bedc0afd2d3d7 \
                    file://components/engine/vendor/github.com/docker/go-connections/LICENSE;md5=04424bc6f5a5be60691b9824d65c2ad8 \
                    file://components/engine/vendor/github.com/docker/go-events/LICENSE;md5=bd1322eeca14e002eef16db6c9e56150 \
                    file://components/engine/vendor/github.com/docker/libkv/LICENSE.code;md5=6f9e0d027a2bf47a682feb132b22d43f \
                    file://components/engine/vendor/github.com/docker/libkv/LICENSE.docs;md5=943c0794b61de2c8ca0d32947015508b \
                    file://components/engine/vendor/github.com/docker/go-units/LICENSE;md5=04424bc6f5a5be60691b9824d65c2ad8 \
                    file://components/engine/vendor/github.com/docker/distribution/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
                    file://components/engine/vendor/github.com/docker/swarmkit/LICENSE;md5=c09df2a11b844feb8c006faa9d68a929 \
                    file://components/engine/vendor/github.com/bits-and-blooms/bitset/LICENSE;md5=0d2b5d66dabaff0df8e1ffe191a21bd1 \
                    file://components/engine/vendor/github.com/googleapis/gax-go/LICENSE;md5=0dd48ae8103725bd7b401261520cdfbb \
                    file://components/engine/vendor/github.com/moby/ipvs/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
                    file://components/engine/vendor/github.com/moby/sys/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/moby/sys/symlink/LICENSE.BSD;md5=55a9a3fbe26d4cac6700847dd7cbd942 \
                    file://components/engine/vendor/github.com/moby/sys/symlink/LICENSE.APACHE;md5=3d44ae130c5e355352c189dce0bbe817 \
                    file://components/engine/vendor/github.com/moby/term/LICENSE;md5=4859e97a9c7780e77972d989f0823f28 \
                    file://components/engine/vendor/github.com/moby/buildkit/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/moby/locker/LICENSE;md5=d4653096bbe6c7090ef605fe464c94e7 \
                    file://components/engine/vendor/github.com/opentracing/opentracing-go/LICENSE;md5=f4e91fcd9abdeb3c904b834127d5cb20 \
                    file://components/engine/vendor/github.com/mistifyio/go-zfs/LICENSE;md5=cce9462224bfb44c1866ef7bd5eddf54 \
                    file://components/engine/vendor/github.com/sirupsen/logrus/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
                    file://components/engine/vendor/github.com/opentracing-contrib/go-stdlib/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/fluent/fluent-logger-golang/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/beorn7/perks/LICENSE;md5=0d0738f37ee8dc0b5f88a32e83c60198 \
                    file://components/engine/vendor/github.com/aws/aws-sdk-go/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/Microsoft/hcsshim/LICENSE;md5=d4c2cbbea5ee1e7c86dff68a7073718e \
                    file://components/engine/vendor/github.com/Microsoft/go-winio/LICENSE;md5=69205ff73858f2c22b2ca135b557e8ef \
                    file://components/engine/vendor/github.com/inconshreveable/mousetrap/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
                    file://components/engine/vendor/github.com/Graylog2/go-gelf/LICENSE;md5=71a1acb4d14c757a86cc351dd90bfbdb \
                    file://components/engine/vendor/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
                    file://components/engine/vendor/github.com/vishvananda/netlink/LICENSE;md5=2ade771c7d7211af507864e8dd520529 \
                    file://components/engine/vendor/github.com/vishvananda/netns/LICENSE;md5=2ade771c7d7211af507864e8dd520529 \
                    file://components/engine/vendor/github.com/matttproud/golang_protobuf_extensions/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://components/engine/vendor/github.com/mitchellh/hashstructure/LICENSE;md5=96ada10a9e51c98c4656f2cede08c673 \
                    file://components/engine/vendor/github.com/json-iterator/go/LICENSE;md5=0b69744b481d72d30dbf69f84a451cfd \
                    file://components/engine/vendor/github.com/prometheus/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/prometheus/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/prometheus/client_model/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/google/certificate-transparency-go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
                    file://components/engine/vendor/github.com/google/shlex/COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/google/uuid/LICENSE;md5=88073b6dd8ec00fe09da59e0b6dfded1 \
                    file://components/engine/vendor/github.com/jmespath/go-jmespath/LICENSE;md5=9abfa8353fce3f2cb28364e1e9016852 \
                    file://components/engine/vendor/github.com/spf13/pflag/LICENSE;md5=1e8b7dc8b906737639131047a590f21d \
                    file://components/engine/vendor/github.com/spf13/cobra/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
                    file://components/engine/vendor/github.com/klauspost/compress/LICENSE;md5=f6eed50d75781660de81b193021f14a2 \
                    file://components/engine/vendor/github.com/klauspost/compress/snappy/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6 \
                    file://components/engine/vendor/github.com/klauspost/compress/zstd/internal/xxhash/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
                    file://components/engine/vendor/github.com/fernet/fernet-go/License;md5=a7cb1ea2b1ab47d1624c5a05b79bc61d \
                    file://components/engine/vendor/github.com/cespare/xxhash/v2/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
                    file://components/engine/vendor/github.com/fsnotify/fsnotify/LICENSE;md5=68f2948d3c4943313d07e084a362486c \
                    file://components/engine/vendor/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
                    file://components/engine/vendor/github.com/gofrs/flock/LICENSE;md5=4e7459b34ebe4461b4dbc9eb5856431f \
                    file://components/engine/vendor/github.com/sean-/seed/LICENSE;md5=ae6a5709472e0833798453b9fa793364 \
                    file://components/engine/vendor/github.com/cilium/ebpf/LICENSE;md5=011d5eef39494cc16bc0b1848fe42759 \
                    file://components/engine/vendor/github.com/gogo/protobuf/LICENSE;md5=38be95f95200434dc208e2ee3dab5081 \
                    file://components/engine/vendor/github.com/gogo/googleapis/LICENSE;md5=341a1ea73c4135749558df781356c143 \
                    file://components/engine/vendor/github.com/syndtr/gocapability/LICENSE;md5=a7304f5073e7be4ba7bffabbf9f2bbca \
                    file://components/engine/vendor/github.com/containerd/fifo/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/containerd/continuity/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/engine/vendor/github.com/containerd/typeurl/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/engine/vendor/github.com/containerd/go-runc/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/containerd/ttrpc/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/containerd/console/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/engine/vendor/github.com/containerd/cgroups/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/engine/vendor/github.com/containerd/containerd/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/engine/vendor/github.com/tonistiigi/fsutil/LICENSE;md5=dd50eb00dd34653989c25a6eb8affb4b \
                    file://components/engine/vendor/github.com/tonistiigi/units/LICENSE;md5=adab126d737576ca74dbd8acbf706365 \
                    file://components/engine/vendor/github.com/armon/go-metrics/LICENSE;md5=d2d77030c0183e3d1e66d26dc1f243be \
                    file://components/engine/vendor/github.com/armon/go-radix/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
                    file://components/engine/vendor/github.com/tchap/go-patricia/LICENSE;md5=9949b99212edd6b1e24ce702376c3baf \
                    file://components/engine/vendor/github.com/coreos/go-semver/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/coreos/pkg/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
                    file://components/engine/vendor/github.com/coreos/etcd/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/github.com/coreos/go-systemd/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/engine/vendor/github.com/coreos/go-systemd/v22/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/engine/vendor/github.com/miekg/dns/LICENSE;md5=567c1ad6c08ca0ee8d7e0a0cf790aff9 \
                    file://components/engine/vendor/cloud.google.com/go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/code.cloudfoundry.org/clock/LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9 \
                    file://components/engine/vendor/google.golang.org/grpc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/google.golang.org/api/LICENSE;md5=a651bb3d8b1c412632e28823bb432b40 \
                    file://components/engine/vendor/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/engine/vendor/gotest.tools/v3/LICENSE;md5=26d13e18e6e60338287c11c73cc80ff5 \
                    file://components/engine/vendor/gotest.tools/v3/internal/difflib/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e \
                    file://components/packaging/LICENSE;md5=9740d093a080530b5c5c6573df9af45a \
                    file://components/cli/LICENSE;md5=9740d093a080530b5c5c6573df9af45a \
                    file://components/cli/vendor/go.opencensus.io/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
                    file://components/cli/vendor/k8s.io/apimachinery/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/k8s.io/klog/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/cli/vendor/k8s.io/kube-openapi/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/k8s.io/api/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/k8s.io/client-go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/k8s.io/utils/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://components/cli/vendor/github.com/hashicorp/golang-lru/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
                    file://components/cli/vendor/github.com/Azure/go-ansiterm/LICENSE;md5=6000442264015a23894024af9930539b \
                    file://components/cli/vendor/github.com/cpuguy83/go-md2man/v2/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517 \
                    file://components/cli/vendor/github.com/gorilla/mux/LICENSE;md5=33fa1116c45f9e8de714033f99edde13 \
                    file://components/cli/vendor/github.com/morikuni/aec/LICENSE;md5=86852eb2df591157c788f3ba889c8aec \
                    file://components/cli/vendor/github.com/modern-go/concurrent/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/modern-go/reflect2/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
                    file://components/cli/vendor/github.com/grpc-ecosystem/grpc-gateway/LICENSE.txt;md5=c510a2a01572b82d27f28fd4d02ca318 \
                    file://components/cli/vendor/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/grpc-ecosystem/grpc-opentracing/LICENSE;md5=e27f3702c0ce9855a5642e90f88757e4 \
                    file://components/cli/vendor/github.com/xeipuuv/gojsonreference/LICENSE-APACHE-2.0.txt;md5=f7a6312e0b85b17786de3ae15ab42bed \
                    file://components/cli/vendor/github.com/xeipuuv/gojsonschema/LICENSE-APACHE-2.0.txt;md5=f7a6312e0b85b17786de3ae15ab42bed \
                    file://components/cli/vendor/github.com/xeipuuv/gojsonpointer/LICENSE-APACHE-2.0.txt;md5=f7a6312e0b85b17786de3ae15ab42bed \
                    file://components/cli/vendor/github.com/golang/protobuf/LICENSE;md5=939cce1ec101726fa754e698ac871622 \
                    file://components/cli/vendor/github.com/golang/glog/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/cli/vendor/github.com/golang/groupcache/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
                    file://components/cli/vendor/github.com/evanphx/json-patch/LICENSE;md5=72c842ec53c3334a81b6d65b6f9025a3 \
                    file://components/cli/vendor/github.com/opencontainers/image-spec/LICENSE;md5=27ef03aa2da6e424307f102e8b42621d \
                    file://components/cli/vendor/github.com/opencontainers/runc/LICENSE;md5=435b266b3899aa8a959f17d41c56def8 \
                    file://components/cli/vendor/github.com/opencontainers/go-digest/LICENSE.docs;md5=943c0794b61de2c8ca0d32947015508b \
                    file://components/cli/vendor/github.com/opencontainers/go-digest/LICENSE;md5=2d6fc0e85c3f118af64c85a78d56d3cf \
                    file://components/cli/vendor/github.com/davecgh/go-spew/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56 \
                    file://components/cli/vendor/github.com/shurcooL/sanitized_anchor_name/LICENSE;md5=c670c44b8d826e9b7b99077e5c7ba283 \
                    file://components/cli/vendor/github.com/pkg/errors/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a \
                    file://components/cli/vendor/github.com/docker/go-metrics/LICENSE.docs;md5=943c0794b61de2c8ca0d32947015508b \
                    file://components/cli/vendor/github.com/docker/go-metrics/LICENSE;md5=aadc30f9c14d876ded7bedc0afd2d3d7 \
                    file://components/cli/vendor/github.com/docker/go-connections/LICENSE;md5=04424bc6f5a5be60691b9824d65c2ad8 \
                    file://components/cli/vendor/github.com/docker/go-events/LICENSE;md5=bd1322eeca14e002eef16db6c9e56150 \
                    file://components/cli/vendor/github.com/docker/docker/LICENSE;md5=4859e97a9c7780e77972d989f0823f28 \
                    file://components/cli/vendor/github.com/docker/go-units/LICENSE;md5=04424bc6f5a5be60691b9824d65c2ad8 \
                    file://components/cli/vendor/github.com/docker/go/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
                    file://components/cli/vendor/github.com/docker/compose-on-kubernetes/LICENSE;md5=bd1322eeca14e002eef16db6c9e56150 \
                    file://components/cli/vendor/github.com/docker/distribution/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
                    file://components/cli/vendor/github.com/docker/swarmkit/LICENSE;md5=c09df2a11b844feb8c006faa9d68a929 \
                    file://components/cli/vendor/github.com/docker/docker-credential-helpers/LICENSE;md5=5f28a5a15a6bde800864f444aee95768 \
                    file://components/cli/vendor/github.com/googleapis/gnostic/LICENSE;md5=b1e01b26bacfc2232046c90a330332b3 \
                    file://components/cli/vendor/github.com/moby/sys/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/github.com/moby/sys/symlink/LICENSE.BSD;md5=55a9a3fbe26d4cac6700847dd7cbd942 \
                    file://components/cli/vendor/github.com/moby/sys/symlink/LICENSE.APACHE;md5=3d44ae130c5e355352c189dce0bbe817 \
                    file://components/cli/vendor/github.com/moby/term/LICENSE;md5=4859e97a9c7780e77972d989f0823f28 \
                    file://components/cli/vendor/github.com/moby/buildkit/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/opentracing/opentracing-go/LICENSE;md5=f4e91fcd9abdeb3c904b834127d5cb20 \
                    file://components/cli/vendor/github.com/sirupsen/logrus/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
                    file://components/cli/vendor/github.com/beorn7/perks/LICENSE;md5=0d0738f37ee8dc0b5f88a32e83c60198 \
                    file://components/cli/vendor/github.com/Microsoft/hcsshim/LICENSE;md5=d4c2cbbea5ee1e7c86dff68a7073718e \
                    file://components/cli/vendor/github.com/Microsoft/go-winio/LICENSE;md5=69205ff73858f2c22b2ca135b557e8ef \
                    file://components/cli/vendor/github.com/inconshreveable/mousetrap/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
                    file://components/cli/vendor/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
                    file://components/cli/vendor/github.com/matttproud/golang_protobuf_extensions/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://components/cli/vendor/github.com/mitchellh/mapstructure/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
                    file://components/cli/vendor/github.com/json-iterator/go/LICENSE;md5=0b69744b481d72d30dbf69f84a451cfd \
                    file://components/cli/vendor/github.com/prometheus/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/prometheus/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/prometheus/client_model/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
                    file://components/cli/vendor/github.com/google/shlex/COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/github.com/google/gofuzz/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/github.com/jaguilar/vt100/LICENSE;md5=4204c8a598bfa7837b9f80a2e22f649c \
                    file://components/cli/vendor/github.com/spf13/pflag/LICENSE;md5=1e8b7dc8b906737639131047a590f21d \
                    file://components/cli/vendor/github.com/spf13/cobra/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
                    file://components/cli/vendor/github.com/cespare/xxhash/v2/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
                    file://components/cli/vendor/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
                    file://components/cli/vendor/github.com/gofrs/flock/LICENSE;md5=4e7459b34ebe4461b4dbc9eb5856431f \
                    file://components/cli/vendor/github.com/gogo/protobuf/LICENSE;md5=38be95f95200434dc208e2ee3dab5081 \
                    file://components/cli/vendor/github.com/gogo/googleapis/LICENSE;md5=341a1ea73c4135749558df781356c143 \
                    file://components/cli/vendor/github.com/russross/blackfriday/v2/LICENSE.txt;md5=ecf8a8a60560c35a862a4a545f2db1b3 \
                    file://components/cli/vendor/github.com/containerd/continuity/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/cli/vendor/github.com/containerd/typeurl/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/cli/vendor/github.com/containerd/console/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/cli/vendor/github.com/containerd/cgroups/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://components/cli/vendor/github.com/containerd/containerd/LICENSE;md5=1269f40c0d099c21a871163984590d89 \
                    file://components/cli/vendor/github.com/tonistiigi/fsutil/LICENSE;md5=dd50eb00dd34653989c25a6eb8affb4b \
                    file://components/cli/vendor/github.com/tonistiigi/units/LICENSE;md5=adab126d737576ca74dbd8acbf706365 \
                    file://components/cli/vendor/github.com/tonistiigi/go-rosetta/LICENSE;md5=b4160f65603932c98bc85f4c0c504bca \
                    file://components/cli/vendor/github.com/theupdateframework/notary/LICENSE;md5=3596b980bb036e0875174ed15e4b982a \
                    file://components/cli/vendor/github.com/theupdateframework/notary/tuf/LICENSE;md5=76f1c154d586fb0376f8b8e49ea82444 \
                    file://components/cli/vendor/github.com/fvbommel/sortorder/LICENSE;md5=9f7e1d7e8f527330ebb5f4c32e0f3e40 \
                    file://components/cli/vendor/github.com/coreos/etcd/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/github.com/miekg/pkcs11/LICENSE;md5=746b23f793d7aaacdeb34a1c4e7d103b \
                    file://components/cli/vendor/cloud.google.com/go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/sigs.k8s.io/yaml/LICENSE;md5=0ceb9ff3b27d3a8cf451ca3785d73c71 \
                    file://components/cli/vendor/gopkg.in/yaml.v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://components/cli/vendor/gopkg.in/yaml.v2/LICENSE.libyaml;md5=d0b68be4a2dc957aaf09144970bc6696 \
                    file://components/cli/vendor/gopkg.in/inf.v0/LICENSE;md5=13cea479df204c85485b5db6eb1bc9d5 \
                    file://components/cli/vendor/google.golang.org/grpc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://components/cli/vendor/gotest.tools/v3/LICENSE;md5=26d13e18e6e60338287c11c73cc80ff5 \
                    file://components/cli/vendor/gotest.tools/v3/internal/difflib/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e"

SRC_URI = "git://github.com/docker/docker-ce;protocol=https"

# Modify these as desired
PV = "20.10.0-beta1+git${SRCPV}"
SRCREV = "b6917096187f33fff1fecb0b06ae22a267387082"

S = "${WORKDIR}/git"

# NOTE: spec file indicates the license may be "ASL 2.0"
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	:
}

LICENSE = "GPLv3"