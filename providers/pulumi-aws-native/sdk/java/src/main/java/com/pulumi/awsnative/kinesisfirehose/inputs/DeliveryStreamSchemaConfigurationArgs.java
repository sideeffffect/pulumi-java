// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamSchemaConfigurationArgs extends ResourceArgs {

    public static final DeliveryStreamSchemaConfigurationArgs Empty = new DeliveryStreamSchemaConfigurationArgs();

    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="roleARN")
    private @Nullable Output<String> roleARN;

    public Optional<Output<String>> roleARN() {
        return Optional.ofNullable(this.roleARN);
    }

    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private DeliveryStreamSchemaConfigurationArgs() {}

    private DeliveryStreamSchemaConfigurationArgs(DeliveryStreamSchemaConfigurationArgs $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.region = $.region;
        this.roleARN = $.roleARN;
        this.tableName = $.tableName;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamSchemaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamSchemaConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamSchemaConfigurationArgs();
        }

        public Builder(DeliveryStreamSchemaConfigurationArgs defaults) {
            $ = new DeliveryStreamSchemaConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder roleARN(@Nullable Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public DeliveryStreamSchemaConfigurationArgs build() {
            return $;
        }
    }

}
