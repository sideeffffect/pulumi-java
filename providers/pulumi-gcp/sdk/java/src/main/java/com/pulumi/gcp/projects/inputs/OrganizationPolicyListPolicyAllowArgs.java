// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyAllowArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyAllowArgs Empty = new OrganizationPolicyListPolicyAllowArgs();

    /**
     * The policy allows or denies all values.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private OrganizationPolicyListPolicyAllowArgs() {}

    private OrganizationPolicyListPolicyAllowArgs(OrganizationPolicyListPolicyAllowArgs $) {
        this.all = $.all;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyListPolicyAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyListPolicyAllowArgs $;

        public Builder() {
            $ = new OrganizationPolicyListPolicyAllowArgs();
        }

        public Builder(OrganizationPolicyListPolicyAllowArgs defaults) {
            $ = new OrganizationPolicyListPolicyAllowArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public OrganizationPolicyListPolicyAllowArgs build() {
            return $;
        }
    }

}
