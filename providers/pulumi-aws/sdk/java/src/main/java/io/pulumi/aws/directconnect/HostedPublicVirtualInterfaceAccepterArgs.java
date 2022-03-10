// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedPublicVirtualInterfaceAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedPublicVirtualInterfaceAccepterArgs Empty = new HostedPublicVirtualInterfaceAccepterArgs();

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @InputImport(name="virtualInterfaceId", required=true)
      private final Input<String> virtualInterfaceId;

    public Input<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    public HostedPublicVirtualInterfaceAccepterArgs(
        @Nullable Input<Map<String,String>> tags,
        Input<String> virtualInterfaceId) {
        this.tags = tags;
        this.virtualInterfaceId = Objects.requireNonNull(virtualInterfaceId, "expected parameter 'virtualInterfaceId' to be non-null");
    }

    private HostedPublicVirtualInterfaceAccepterArgs() {
        this.tags = Input.empty();
        this.virtualInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedPublicVirtualInterfaceAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> virtualInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedPublicVirtualInterfaceAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.virtualInterfaceId = defaults.virtualInterfaceId;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder virtualInterfaceId(Input<String> virtualInterfaceId) {
            this.virtualInterfaceId = Objects.requireNonNull(virtualInterfaceId);
            return this;
        }

        public Builder virtualInterfaceId(String virtualInterfaceId) {
            this.virtualInterfaceId = Input.of(Objects.requireNonNull(virtualInterfaceId));
            return this;
        }
        public HostedPublicVirtualInterfaceAccepterArgs build() {
            return new HostedPublicVirtualInterfaceAccepterArgs(tags, virtualInterfaceId);
        }
    }
}
