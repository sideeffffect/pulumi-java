// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elasticsan;

import com.pulumi.azurenative.elasticsan.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticSanArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticSanArgs Empty = new ElasticSanArgs();

    /**
     * Logical zone for Elastic San resource; example: [&#34;1&#34;].
     * 
     */
    @Import(name="availabilityZones", required=true)
    private Output<List<String>> availabilityZones;

    /**
     * @return Logical zone for Elastic San resource; example: [&#34;1&#34;].
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Base size of the Elastic San appliance in TiB.
     * 
     */
    @Import(name="baseSizeTiB", required=true)
    private Output<Double> baseSizeTiB;

    /**
     * @return Base size of the Elastic San appliance in TiB.
     * 
     */
    public Output<Double> baseSizeTiB() {
        return this.baseSizeTiB;
    }

    /**
     * The name of the ElasticSan.
     * 
     */
    @Import(name="elasticSanName")
    private @Nullable Output<String> elasticSanName;

    /**
     * @return The name of the ElasticSan.
     * 
     */
    public Optional<Output<String>> elasticSanName() {
        return Optional.ofNullable(this.elasticSanName);
    }

    /**
     * Extended size of the Elastic San appliance in TiB.
     * 
     */
    @Import(name="extendedCapacitySizeTiB", required=true)
    private Output<Double> extendedCapacitySizeTiB;

    /**
     * @return Extended size of the Elastic San appliance in TiB.
     * 
     */
    public Output<Double> extendedCapacitySizeTiB() {
        return this.extendedCapacitySizeTiB;
    }

    /**
     * The geo-location where the resource lives.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * resource sku
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    /**
     * @return resource sku
     * 
     */
    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ElasticSanArgs() {}

    private ElasticSanArgs(ElasticSanArgs $) {
        this.availabilityZones = $.availabilityZones;
        this.baseSizeTiB = $.baseSizeTiB;
        this.elasticSanName = $.elasticSanName;
        this.extendedCapacitySizeTiB = $.extendedCapacitySizeTiB;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticSanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticSanArgs $;

        public Builder() {
            $ = new ElasticSanArgs();
        }

        public Builder(ElasticSanArgs defaults) {
            $ = new ElasticSanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZones Logical zone for Elastic San resource; example: [&#34;1&#34;].
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones Logical zone for Elastic San resource; example: [&#34;1&#34;].
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones Logical zone for Elastic San resource; example: [&#34;1&#34;].
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param baseSizeTiB Base size of the Elastic San appliance in TiB.
         * 
         * @return builder
         * 
         */
        public Builder baseSizeTiB(Output<Double> baseSizeTiB) {
            $.baseSizeTiB = baseSizeTiB;
            return this;
        }

        /**
         * @param baseSizeTiB Base size of the Elastic San appliance in TiB.
         * 
         * @return builder
         * 
         */
        public Builder baseSizeTiB(Double baseSizeTiB) {
            return baseSizeTiB(Output.of(baseSizeTiB));
        }

        /**
         * @param elasticSanName The name of the ElasticSan.
         * 
         * @return builder
         * 
         */
        public Builder elasticSanName(@Nullable Output<String> elasticSanName) {
            $.elasticSanName = elasticSanName;
            return this;
        }

        /**
         * @param elasticSanName The name of the ElasticSan.
         * 
         * @return builder
         * 
         */
        public Builder elasticSanName(String elasticSanName) {
            return elasticSanName(Output.of(elasticSanName));
        }

        /**
         * @param extendedCapacitySizeTiB Extended size of the Elastic San appliance in TiB.
         * 
         * @return builder
         * 
         */
        public Builder extendedCapacitySizeTiB(Output<Double> extendedCapacitySizeTiB) {
            $.extendedCapacitySizeTiB = extendedCapacitySizeTiB;
            return this;
        }

        /**
         * @param extendedCapacitySizeTiB Extended size of the Elastic San appliance in TiB.
         * 
         * @return builder
         * 
         */
        public Builder extendedCapacitySizeTiB(Double extendedCapacitySizeTiB) {
            return extendedCapacitySizeTiB(Output.of(extendedCapacitySizeTiB));
        }

        /**
         * @param location The geo-location where the resource lives.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku resource sku
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku resource sku
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Azure resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Azure resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ElasticSanArgs build() {
            $.availabilityZones = Objects.requireNonNull($.availabilityZones, "expected parameter 'availabilityZones' to be non-null");
            $.baseSizeTiB = Objects.requireNonNull($.baseSizeTiB, "expected parameter 'baseSizeTiB' to be non-null");
            $.extendedCapacitySizeTiB = Objects.requireNonNull($.extendedCapacitySizeTiB, "expected parameter 'extendedCapacitySizeTiB' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
