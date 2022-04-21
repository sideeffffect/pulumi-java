// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupArgs Empty = new SecurityGroupArgs();

    /**
     * description for the cache security group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name for the cache security group. This value is stored as a lowercase string.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of EC2 security group names to be
     * authorized for ingress to the cache security group
     * 
     */
    @Import(name="securityGroupNames", required=true)
    private Output<List<String>> securityGroupNames;

    public Output<List<String>> securityGroupNames() {
        return this.securityGroupNames;
    }

    private SecurityGroupArgs() {}

    private SecurityGroupArgs(SecurityGroupArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.securityGroupNames = $.securityGroupNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupArgs $;

        public Builder() {
            $ = new SecurityGroupArgs();
        }

        public Builder(SecurityGroupArgs defaults) {
            $ = new SecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder securityGroupNames(Output<List<String>> securityGroupNames) {
            $.securityGroupNames = securityGroupNames;
            return this;
        }

        public Builder securityGroupNames(List<String> securityGroupNames) {
            return securityGroupNames(Output.of(securityGroupNames));
        }

        public Builder securityGroupNames(String... securityGroupNames) {
            return securityGroupNames(List.of(securityGroupNames));
        }

        public SecurityGroupArgs build() {
            $.description = Codegen.stringProp("description").output().arg($.description).def("Managed by Pulumi").getNullable();
            $.securityGroupNames = Objects.requireNonNull($.securityGroupNames, "expected parameter 'securityGroupNames' to be non-null");
            return $;
        }
    }

}
