// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * S3 buckets and Regions to include/exclude in the Amazon S3 Storage Lens configuration.
 * 
 */
public final class StorageLensBucketsAndRegionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageLensBucketsAndRegionsArgs Empty = new StorageLensBucketsAndRegionsArgs();

    @Import(name="buckets")
    private @Nullable Output<List<String>> buckets;

    public Optional<Output<List<String>>> buckets() {
        return Optional.ofNullable(this.buckets);
    }

    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    private StorageLensBucketsAndRegionsArgs() {}

    private StorageLensBucketsAndRegionsArgs(StorageLensBucketsAndRegionsArgs $) {
        this.buckets = $.buckets;
        this.regions = $.regions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensBucketsAndRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensBucketsAndRegionsArgs $;

        public Builder() {
            $ = new StorageLensBucketsAndRegionsArgs();
        }

        public Builder(StorageLensBucketsAndRegionsArgs defaults) {
            $ = new StorageLensBucketsAndRegionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder buckets(@Nullable Output<List<String>> buckets) {
            $.buckets = buckets;
            return this;
        }

        public Builder buckets(List<String> buckets) {
            return buckets(Output.of(buckets));
        }

        public Builder buckets(String... buckets) {
            return buckets(List.of(buckets));
        }

        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public StorageLensBucketsAndRegionsArgs build() {
            return $;
        }
    }

}
