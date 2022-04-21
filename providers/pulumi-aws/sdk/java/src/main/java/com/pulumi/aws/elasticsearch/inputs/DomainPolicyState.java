// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final DomainPolicyState Empty = new DomainPolicyState();

    /**
     * IAM policy document specifying the access policies for the domain
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<String> accessPolicies;

    public Optional<Output<String>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    private DomainPolicyState() {}

    private DomainPolicyState(DomainPolicyState $) {
        this.accessPolicies = $.accessPolicies;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainPolicyState $;

        public Builder() {
            $ = new DomainPolicyState();
        }

        public Builder(DomainPolicyState defaults) {
            $ = new DomainPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicies(@Nullable Output<String> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        public Builder accessPolicies(String accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public DomainPolicyState build() {
            return $;
        }
    }

}
