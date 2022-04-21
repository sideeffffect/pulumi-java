// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs Empty = new CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs();

    /**
     * Name of the schema registry that contains the schema. Must be provided when `schema_name` is specified and conflicts with `schema_arn`.
     * 
     */
    @Import(name="registryName")
    private @Nullable Output<String> registryName;

    public Optional<Output<String>> registryName() {
        return Optional.ofNullable(this.registryName);
    }

    /**
     * ARN of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    @Import(name="schemaArn")
    private @Nullable Output<String> schemaArn;

    public Optional<Output<String>> schemaArn() {
        return Optional.ofNullable(this.schemaArn);
    }

    /**
     * Name of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    private CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs() {}

    private CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs(CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs $) {
        this.registryName = $.registryName;
        this.schemaArn = $.schemaArn;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs $;

        public Builder() {
            $ = new CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs();
        }

        public Builder(CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs defaults) {
            $ = new CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder registryName(@Nullable Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        public Builder schemaArn(@Nullable Output<String> schemaArn) {
            $.schemaArn = schemaArn;
            return this;
        }

        public Builder schemaArn(String schemaArn) {
            return schemaArn(Output.of(schemaArn));
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs build() {
            return $;
        }
    }

}
