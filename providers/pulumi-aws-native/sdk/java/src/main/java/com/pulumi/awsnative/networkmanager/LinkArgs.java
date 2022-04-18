// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.awsnative.networkmanager.inputs.LinkBandwidthArgs;
import com.pulumi.awsnative.networkmanager.inputs.LinkTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * The Bandwidth for the link.
     * 
     */
    @Import(name="bandwidth", required=true)
      private final Output<LinkBandwidthArgs> bandwidth;

    public Output<LinkBandwidthArgs> bandwidth() {
        return this.bandwidth;
    }

    /**
     * The description of the link.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
      private final Output<String> globalNetworkId;

    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The provider of the link.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<String> provider;

    public Output<String> provider() {
        return this.provider == null ? Codegen.empty() : this.provider;
    }

    /**
     * The ID of the site
     * 
     */
    @Import(name="siteId", required=true)
      private final Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    /**
     * The tags for the link.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<LinkTagArgs>> tags;

    public Output<List<LinkTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The type of the link.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public LinkArgs(
        Output<LinkBandwidthArgs> bandwidth,
        @Nullable Output<String> description,
        Output<String> globalNetworkId,
        @Nullable Output<String> provider,
        Output<String> siteId,
        @Nullable Output<List<LinkTagArgs>> tags,
        @Nullable Output<String> type) {
        this.bandwidth = Objects.requireNonNull(bandwidth, "expected parameter 'bandwidth' to be non-null");
        this.description = description;
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.provider = provider;
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
        this.tags = tags;
        this.type = type;
    }

    private LinkArgs() {
        this.bandwidth = Codegen.empty();
        this.description = Codegen.empty();
        this.globalNetworkId = Codegen.empty();
        this.provider = Codegen.empty();
        this.siteId = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<LinkBandwidthArgs> bandwidth;
        private @Nullable Output<String> description;
        private Output<String> globalNetworkId;
        private @Nullable Output<String> provider;
        private Output<String> siteId;
        private @Nullable Output<List<LinkTagArgs>> tags;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.provider = defaults.provider;
    	      this.siteId = defaults.siteId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder bandwidth(Output<LinkBandwidthArgs> bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder bandwidth(LinkBandwidthArgs bandwidth) {
            this.bandwidth = Output.of(Objects.requireNonNull(bandwidth));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Output.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }
        public Builder provider(@Nullable Output<String> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable String provider) {
            this.provider = Codegen.ofNullable(provider);
            return this;
        }
        public Builder siteId(Output<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder siteId(String siteId) {
            this.siteId = Output.of(Objects.requireNonNull(siteId));
            return this;
        }
        public Builder tags(@Nullable Output<List<LinkTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<LinkTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(LinkTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public LinkArgs build() {
            return new LinkArgs(bandwidth, description, globalNetworkId, provider, siteId, tags, type);
        }
    }
}
