// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartitionArgs Empty = new PartitionArgs();

    @Import(name="entityId", required=true)
    private Output<String> entityId;

    public Output<String> entityId() {
        return this.entityId;
    }

    /**
     * Optional. The etag for this partition.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. The etag for this partition.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="lakeId", required=true)
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }

    /**
     * Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    /**
     * @return Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    /**
     * Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private PartitionArgs() {}

    private PartitionArgs(PartitionArgs $) {
        this.entityId = $.entityId;
        this.etag = $.etag;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.validateOnly = $.validateOnly;
        this.values = $.values;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartitionArgs $;

        public Builder() {
            $ = new PartitionArgs();
        }

        public Builder(PartitionArgs defaults) {
            $ = new PartitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityId(Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param etag Optional. The etag for this partition.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. The etag for this partition.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder lakeId(Output<String> lakeId) {
            $.lakeId = lakeId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            return lakeId(Output.of(lakeId));
        }

        /**
         * @param location Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Immutable. The location of the entity data within the partition, for example, gs://bucket/path/to/entity/key1=value1/key2=value2. Or projects//datasets//tables/
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        /**
         * @param values Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Immutable. The set of values representing the partition, which correspond to the partition schema defined in the parent entity.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public PartitionArgs build() {
            $.entityId = Objects.requireNonNull($.entityId, "expected parameter 'entityId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
