// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionIamPolicyPlainArgs Empty = new GetSubscriptionIamPolicyPlainArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="subscriptionId", required=true)
    private String subscriptionId;

    public String subscriptionId() {
        return this.subscriptionId;
    }

    private GetSubscriptionIamPolicyPlainArgs() {}

    private GetSubscriptionIamPolicyPlainArgs(GetSubscriptionIamPolicyPlainArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetSubscriptionIamPolicyPlainArgs();
        }

        public Builder(GetSubscriptionIamPolicyPlainArgs defaults) {
            $ = new GetSubscriptionIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public GetSubscriptionIamPolicyPlainArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
