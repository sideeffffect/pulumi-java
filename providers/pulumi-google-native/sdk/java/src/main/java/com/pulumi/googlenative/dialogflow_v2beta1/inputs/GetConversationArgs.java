// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationArgs Empty = new GetConversationArgs();

    @Import(name="conversationId", required=true)
    private String conversationId;

    public String conversationId() {
        return this.conversationId;
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

    private GetConversationArgs() {}

    private GetConversationArgs(GetConversationArgs $) {
        this.conversationId = $.conversationId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationArgs $;

        public Builder() {
            $ = new GetConversationArgs();
        }

        public Builder(GetConversationArgs defaults) {
            $ = new GetConversationArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationId(String conversationId) {
            $.conversationId = conversationId;
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

        public GetConversationArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
