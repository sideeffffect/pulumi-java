// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGuestPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGuestPolicyArgs Empty = new GetGuestPolicyArgs();

    @Import(name="guestPolicyId", required=true)
    private Output<String> guestPolicyId;

    public Output<String> guestPolicyId() {
        return this.guestPolicyId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGuestPolicyArgs() {}

    private GetGuestPolicyArgs(GetGuestPolicyArgs $) {
        this.guestPolicyId = $.guestPolicyId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGuestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGuestPolicyArgs $;

        public Builder() {
            $ = new GetGuestPolicyArgs();
        }

        public Builder(GetGuestPolicyArgs defaults) {
            $ = new GetGuestPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder guestPolicyId(Output<String> guestPolicyId) {
            $.guestPolicyId = guestPolicyId;
            return this;
        }

        public Builder guestPolicyId(String guestPolicyId) {
            return guestPolicyId(Output.of(guestPolicyId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetGuestPolicyArgs build() {
            $.guestPolicyId = Objects.requireNonNull($.guestPolicyId, "expected parameter 'guestPolicyId' to be non-null");
            return $;
        }
    }

}
