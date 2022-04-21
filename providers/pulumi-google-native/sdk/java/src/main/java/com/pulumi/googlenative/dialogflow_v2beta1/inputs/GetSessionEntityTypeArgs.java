// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSessionEntityTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSessionEntityTypeArgs Empty = new GetSessionEntityTypeArgs();

    @Import(name="entityTypeId", required=true)
    private String entityTypeId;

    public String entityTypeId() {
        return this.entityTypeId;
    }

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
    }

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

    @Import(name="sessionId", required=true)
    private String sessionId;

    public String sessionId() {
        return this.sessionId;
    }

    @Import(name="userId", required=true)
    private String userId;

    public String userId() {
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

        public Builder entityTypeId(String entityTypeId) {
            $.entityTypeId = entityTypeId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sessionId(String sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        public Builder userId(String userId) {
            $.userId = userId;
            return this;
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
