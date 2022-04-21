// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntentArgs Empty = new GetIntentArgs();

    @Import(name="agentId", required=true)
    private String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="intentId", required=true)
    private String intentId;

    public String intentId() {
        return this.intentId;
    }

    @Import(name="languageCode")
    private @Nullable String languageCode;

    public Optional<String> languageCode() {
        return Optional.ofNullable(this.languageCode);
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

    private GetIntentArgs() {}

    private GetIntentArgs(GetIntentArgs $) {
        this.agentId = $.agentId;
        this.intentId = $.intentId;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntentArgs $;

        public Builder() {
            $ = new GetIntentArgs();
        }

        public Builder(GetIntentArgs defaults) {
            $ = new GetIntentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder intentId(String intentId) {
            $.intentId = intentId;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            $.languageCode = languageCode;
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

        public GetIntentArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.intentId = Objects.requireNonNull($.intentId, "expected parameter 'intentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
