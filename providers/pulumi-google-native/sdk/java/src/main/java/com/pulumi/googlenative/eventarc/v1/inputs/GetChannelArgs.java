// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    @Import(name="channelId", required=true)
    private Output<String> channelId;

    public Output<String> channelId() {
        return this.channelId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetChannelArgs() {}

    private GetChannelArgs(GetChannelArgs $) {
        this.channelId = $.channelId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelArgs $;

        public Builder() {
            $ = new GetChannelArgs();
        }

        public Builder(GetChannelArgs defaults) {
            $ = new GetChannelArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelId(Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetChannelArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
