// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamPlainArgs Empty = new GetStreamPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="streamId", required=true)
    private String streamId;

    public String streamId() {
        return this.streamId;
    }

    private GetStreamPlainArgs() {}

    private GetStreamPlainArgs(GetStreamPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.streamId = $.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamPlainArgs $;

        public Builder() {
            $ = new GetStreamPlainArgs();
        }

        public Builder(GetStreamPlainArgs defaults) {
            $ = new GetStreamPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder streamId(String streamId) {
            $.streamId = streamId;
            return this;
        }

        public GetStreamPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.streamId = Objects.requireNonNull($.streamId, "expected parameter 'streamId' to be non-null");
            return $;
        }
    }

}
