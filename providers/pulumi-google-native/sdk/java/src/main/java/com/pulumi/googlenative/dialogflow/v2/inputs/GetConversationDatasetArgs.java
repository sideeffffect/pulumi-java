// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationDatasetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationDatasetArgs Empty = new GetConversationDatasetArgs();

    @Import(name="conversationDatasetId", required=true)
    private Output<String> conversationDatasetId;

    public Output<String> conversationDatasetId() {
        return this.conversationDatasetId;
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

    private GetConversationDatasetArgs() {}

    private GetConversationDatasetArgs(GetConversationDatasetArgs $) {
        this.conversationDatasetId = $.conversationDatasetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationDatasetArgs $;

        public Builder() {
            $ = new GetConversationDatasetArgs();
        }

        public Builder(GetConversationDatasetArgs defaults) {
            $ = new GetConversationDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationDatasetId(Output<String> conversationDatasetId) {
            $.conversationDatasetId = conversationDatasetId;
            return this;
        }

        public Builder conversationDatasetId(String conversationDatasetId) {
            return conversationDatasetId(Output.of(conversationDatasetId));
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

        public GetConversationDatasetArgs build() {
            $.conversationDatasetId = Objects.requireNonNull($.conversationDatasetId, "expected parameter 'conversationDatasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
