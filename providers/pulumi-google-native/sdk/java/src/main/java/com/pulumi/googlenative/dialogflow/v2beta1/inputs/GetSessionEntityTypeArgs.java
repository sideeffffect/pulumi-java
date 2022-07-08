// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSessionEntityTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSessionEntityTypeArgs Empty = new GetSessionEntityTypeArgs();

    @Import(name="entityTypeId", required=true)
    private Output<String> entityTypeId;

    public Output<String> entityTypeId() {
        return this.entityTypeId;
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
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

    @Import(name="sessionId", required=true)
    private Output<String> sessionId;

    public Output<String> sessionId() {
        return this.sessionId;
    }

    @Import(name="userId", required=true)
    private Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    private GetSessionEntityTypeArgs() {}

    private GetSessionEntityTypeArgs(GetSessionEntityTypeArgs $) {
        this.entityTypeId = $.entityTypeId;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.project = $.project;
        this.sessionId = $.sessionId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSessionEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSessionEntityTypeArgs $;

        public Builder() {
            $ = new GetSessionEntityTypeArgs();
        }

        public Builder(GetSessionEntityTypeArgs defaults) {
            $ = new GetSessionEntityTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityTypeId(Output<String> entityTypeId) {
            $.entityTypeId = entityTypeId;
            return this;
        }

        public Builder entityTypeId(String entityTypeId) {
            return entityTypeId(Output.of(entityTypeId));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
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

        public Builder sessionId(Output<String> sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        public Builder sessionId(String sessionId) {
            return sessionId(Output.of(sessionId));
        }

        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetSessionEntityTypeArgs build() {
            $.entityTypeId = Objects.requireNonNull($.entityTypeId, "expected parameter 'entityTypeId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sessionId = Objects.requireNonNull($.sessionId, "expected parameter 'sessionId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
