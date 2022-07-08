// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertPolicyArgs Empty = new GetAlertPolicyArgs();

    @Import(name="alertPolicyId", required=true)
    private Output<String> alertPolicyId;

    public Output<String> alertPolicyId() {
        return this.alertPolicyId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAlertPolicyArgs() {}

    private GetAlertPolicyArgs(GetAlertPolicyArgs $) {
        this.alertPolicyId = $.alertPolicyId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertPolicyArgs $;

        public Builder() {
            $ = new GetAlertPolicyArgs();
        }

        public Builder(GetAlertPolicyArgs defaults) {
            $ = new GetAlertPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder alertPolicyId(Output<String> alertPolicyId) {
            $.alertPolicyId = alertPolicyId;
            return this;
        }

        public Builder alertPolicyId(String alertPolicyId) {
            return alertPolicyId(Output.of(alertPolicyId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetAlertPolicyArgs build() {
            $.alertPolicyId = Objects.requireNonNull($.alertPolicyId, "expected parameter 'alertPolicyId' to be non-null");
            return $;
        }
    }

}
