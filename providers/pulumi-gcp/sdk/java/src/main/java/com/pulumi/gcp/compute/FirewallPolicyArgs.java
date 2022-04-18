// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The parent of the firewall policy.
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    /**
     * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName", required=true)
      private final Output<String> shortName;

    public Output<String> shortName() {
        return this.shortName;
    }

    public FirewallPolicyArgs(
        @Nullable Output<String> description,
        Output<String> parent,
        Output<String> shortName) {
        this.description = description;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.shortName = Objects.requireNonNull(shortName, "expected parameter 'shortName' to be non-null");
    }

    private FirewallPolicyArgs() {
        this.description = Codegen.empty();
        this.parent = Codegen.empty();
        this.shortName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> parent;
        private Output<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder shortName(Output<String> shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Output.of(Objects.requireNonNull(shortName));
            return this;
        }        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(description, parent, shortName);
        }
    }
}
