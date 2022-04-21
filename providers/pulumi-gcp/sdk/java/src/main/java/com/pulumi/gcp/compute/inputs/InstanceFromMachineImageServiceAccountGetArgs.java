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


public final class InstanceFromMachineImageServiceAccountGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageServiceAccountGetArgs Empty = new InstanceFromMachineImageServiceAccountGetArgs();

    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    public Output<List<String>> scopes() {
        return this.scopes;
    }

    private InstanceFromMachineImageServiceAccountGetArgs() {}

    private InstanceFromMachineImageServiceAccountGetArgs(InstanceFromMachineImageServiceAccountGetArgs $) {
        this.email = $.email;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageServiceAccountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageServiceAccountGetArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageServiceAccountGetArgs();
        }

        public Builder(InstanceFromMachineImageServiceAccountGetArgs defaults) {
            $ = new InstanceFromMachineImageServiceAccountGetArgs(Objects.requireNonNull(defaults));
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

        public InstanceFromMachineImageServiceAccountGetArgs build() {
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            return $;
        }
    }

}
