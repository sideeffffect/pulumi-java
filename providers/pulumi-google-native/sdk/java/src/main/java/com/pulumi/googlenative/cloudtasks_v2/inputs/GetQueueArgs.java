// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueueArgs Empty = new GetQueueArgs();

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

    @Import(name="queueId", required=true)
    private String queueId;

    public String queueId() {
        return this.queueId;
    }

    private GetQueueArgs() {}

    private GetQueueArgs(GetQueueArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.queueId = $.queueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueueArgs $;

        public Builder() {
            $ = new GetQueueArgs();
        }

        public Builder(GetQueueArgs defaults) {
            $ = new GetQueueArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder queueId(String queueId) {
            $.queueId = queueId;
            return this;
        }

        public GetQueueArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.queueId = Objects.requireNonNull($.queueId, "expected parameter 'queueId' to be non-null");
            return $;
        }
    }

}
