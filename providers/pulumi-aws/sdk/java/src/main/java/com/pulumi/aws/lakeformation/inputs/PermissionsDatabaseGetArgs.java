// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsDatabaseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsDatabaseGetArgs Empty = new PermissionsDatabaseGetArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private PermissionsDatabaseGetArgs() {}

    private PermissionsDatabaseGetArgs(PermissionsDatabaseGetArgs $) {
        this.catalogId = $.catalogId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsDatabaseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsDatabaseGetArgs $;

        public Builder() {
            $ = new PermissionsDatabaseGetArgs();
        }

        public Builder(PermissionsDatabaseGetArgs defaults) {
            $ = new PermissionsDatabaseGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PermissionsDatabaseGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
