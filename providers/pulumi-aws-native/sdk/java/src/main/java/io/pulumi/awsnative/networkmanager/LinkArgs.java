// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.networkmanager.inputs.LinkBandwidthArgs;
import io.pulumi.awsnative.networkmanager.inputs.LinkTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * The Bandwidth for the link.
     * 
     */
    @InputImport(name="bandwidth", required=true)
      private final Input<LinkBandwidthArgs> bandwidth;

    public Input<LinkBandwidthArgs> getBandwidth() {
        return this.bandwidth;
    }

    /**
     * The description of the link.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
      private final Input<String> globalNetworkId;

    public Input<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The provider of the link.
     * 
     */
    @InputImport(name="provider")
      private final @Nullable Input<String> provider;

    public Input<String> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    /**
     * The ID of the site
     * 
     */
    @InputImport(name="siteId", required=true)
      private final Input<String> siteId;

    public Input<String> getSiteId() {
        return this.siteId;
    }

    /**
     * The tags for the link.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LinkTagArgs>> tags;

    public Input<List<LinkTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of the link.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public LinkArgs(
        Input<LinkBandwidthArgs> bandwidth,
        @Nullable Input<String> description,
        Input<String> globalNetworkId,
        @Nullable Input<String> provider,
        Input<String> siteId,
        @Nullable Input<List<LinkTagArgs>> tags,
        @Nullable Input<String> type) {
        this.bandwidth = Objects.requireNonNull(bandwidth, "expected parameter 'bandwidth' to be non-null");
        this.description = description;
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.provider = provider;
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
        this.tags = tags;
        this.type = type;
    }

    private LinkArgs() {
        this.bandwidth = Input.empty();
        this.description = Input.empty();
        this.globalNetworkId = Input.empty();
        this.provider = Input.empty();
        this.siteId = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LinkBandwidthArgs> bandwidth;
        private @Nullable Input<String> description;
        private Input<String> globalNetworkId;
        private @Nullable Input<String> provider;
        private Input<String> siteId;
        private @Nullable Input<List<LinkTagArgs>> tags;
        private @Nullable Input<String> type;

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

        public Builder bandwidth(Input<LinkBandwidthArgs> bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }

        public Builder bandwidth(LinkBandwidthArgs bandwidth) {
            this.bandwidth = Input.of(Objects.requireNonNull(bandwidth));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder globalNetworkId(Input<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Input.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }

        public Builder provider(@Nullable Input<String> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(@Nullable String provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public Builder siteId(Input<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder siteId(String siteId) {
            this.siteId = Input.of(Objects.requireNonNull(siteId));
            return this;
        }

        public Builder tags(@Nullable Input<List<LinkTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LinkTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public LinkArgs build() {
            return new LinkArgs(bandwidth, description, globalNetworkId, provider, siteId, tags, type);
        }
    }
}
