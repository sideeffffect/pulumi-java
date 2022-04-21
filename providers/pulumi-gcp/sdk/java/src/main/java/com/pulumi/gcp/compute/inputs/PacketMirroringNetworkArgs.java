// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringNetworkArgs Empty = new PacketMirroringNetworkArgs();

    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private PacketMirroringNetworkArgs() {}

    private PacketMirroringNetworkArgs(PacketMirroringNetworkArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringNetworkArgs $;

        public Builder() {
            $ = new PacketMirroringNetworkArgs();
        }

        public Builder(PacketMirroringNetworkArgs defaults) {
            $ = new PacketMirroringNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PacketMirroringNetworkArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
