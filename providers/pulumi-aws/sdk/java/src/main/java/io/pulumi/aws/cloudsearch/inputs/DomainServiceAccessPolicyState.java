// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainServiceAccessPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyState Empty = new DomainServiceAccessPolicyState();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @Import(name="accessPolicy")
      private final @Nullable Output<String> accessPolicy;

    public Output<String> accessPolicy() {
        return this.accessPolicy == null ? Codegen.empty() : this.accessPolicy;
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    public DomainServiceAccessPolicyState(
        @Nullable Output<String> accessPolicy,
        @Nullable Output<String> domainName) {
        this.accessPolicy = accessPolicy;
        this.domainName = domainName;
    }

    private DomainServiceAccessPolicyState() {
        this.accessPolicy = Codegen.empty();
        this.domainName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessPolicy;
        private @Nullable Output<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceAccessPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.domainName = defaults.domainName;
        }

        public Builder accessPolicy(@Nullable Output<String> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }
        public Builder accessPolicy(@Nullable String accessPolicy) {
            this.accessPolicy = Codegen.ofNullable(accessPolicy);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }        public DomainServiceAccessPolicyState build() {
            return new DomainServiceAccessPolicyState(accessPolicy, domainName);
        }
    }
}
