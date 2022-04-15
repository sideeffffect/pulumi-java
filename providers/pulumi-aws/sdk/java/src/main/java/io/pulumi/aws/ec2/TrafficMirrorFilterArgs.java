// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterArgs Empty = new TrafficMirrorFilterArgs();

    /**
     * A description of the filter.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
     * 
     */
    @Import(name="networkServices")
      private final @Nullable Output<List<String>> networkServices;

    public Output<List<String>> networkServices() {
        return this.networkServices == null ? Codegen.empty() : this.networkServices;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public TrafficMirrorFilterArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> networkServices,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.networkServices = networkServices;
        this.tags = tags;
    }

    private TrafficMirrorFilterArgs() {
        this.description = Codegen.empty();
        this.networkServices = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> networkServices;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.networkServices = defaults.networkServices;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder networkServices(@Nullable Output<List<String>> networkServices) {
            this.networkServices = networkServices;
            return this;
        }
        public Builder networkServices(@Nullable List<String> networkServices) {
            this.networkServices = Codegen.ofNullable(networkServices);
            return this;
        }
        public Builder networkServices(String... networkServices) {
            return networkServices(List.of(networkServices));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public TrafficMirrorFilterArgs build() {
            return new TrafficMirrorFilterArgs(description, networkServices, tags);
        }
    }
}
