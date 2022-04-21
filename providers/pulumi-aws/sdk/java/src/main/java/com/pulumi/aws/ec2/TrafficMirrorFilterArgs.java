// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterArgs Empty = new TrafficMirrorFilterArgs();

    /**
     * A description of the filter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
     * 
     */
    @Import(name="networkServices")
    private @Nullable Output<List<String>> networkServices;

    public Optional<Output<List<String>>> networkServices() {
        return Optional.ofNullable(this.networkServices);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TrafficMirrorFilterArgs() {}

    private TrafficMirrorFilterArgs(TrafficMirrorFilterArgs $) {
        this.description = $.description;
        this.networkServices = $.networkServices;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorFilterArgs $;

        public Builder() {
            $ = new TrafficMirrorFilterArgs();
        }

        public Builder(TrafficMirrorFilterArgs defaults) {
            $ = new TrafficMirrorFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder networkServices(@Nullable Output<List<String>> networkServices) {
            $.networkServices = networkServices;
            return this;
        }

        public Builder networkServices(List<String> networkServices) {
            return networkServices(Output.of(networkServices));
        }

        public Builder networkServices(String... networkServices) {
            return networkServices(List.of(networkServices));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TrafficMirrorFilterArgs build() {
            return $;
        }
    }

}
