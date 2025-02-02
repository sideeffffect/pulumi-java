// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    @Import(name="aliasName", required=true)
    private Output<String> aliasName;

    /**
     * @return Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    public Output<String> aliasName() {
        return this.aliasName;
    }

    private GetAliasArgs() {}

    private GetAliasArgs(GetAliasArgs $) {
        this.aliasName = $.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAliasArgs $;

        public Builder() {
            $ = new GetAliasArgs();
        }

        public Builder(GetAliasArgs defaults) {
            $ = new GetAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        public GetAliasArgs build() {
            $.aliasName = Objects.requireNonNull($.aliasName, "expected parameter 'aliasName' to be non-null");
            return $;
        }
    }

}
