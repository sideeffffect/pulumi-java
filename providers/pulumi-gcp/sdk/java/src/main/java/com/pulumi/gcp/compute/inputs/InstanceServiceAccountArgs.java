// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceServiceAccountArgs Empty = new InstanceServiceAccountArgs();

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    public Output<List<String>> scopes() {
        return this.scopes;
    }

    private InstanceServiceAccountArgs() {}

    private InstanceServiceAccountArgs(InstanceServiceAccountArgs $) {
        this.email = $.email;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceServiceAccountArgs $;

        public Builder() {
            $ = new InstanceServiceAccountArgs();
        }

        public Builder(InstanceServiceAccountArgs defaults) {
            $ = new InstanceServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder scopes(Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public InstanceServiceAccountArgs build() {
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            return $;
        }
    }

}
