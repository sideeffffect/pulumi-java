// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerDynamodbTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerDynamodbTargetGetArgs Empty = new CrawlerDynamodbTargetGetArgs();

    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. Default value is `true`.
     * 
     */
    @InputImport(name="scanAll")
      private final @Nullable Input<Boolean> scanAll;

    public Input<Boolean> getScanAll() {
        return this.scanAll == null ? Input.empty() : this.scanAll;
    }

    /**
     * The percentage of the configured read capacity units to use by the AWS Glue crawler. The valid values are null or a value between 0.1 to 1.5.
     * 
     */
    @InputImport(name="scanRate")
      private final @Nullable Input<Double> scanRate;

    public Input<Double> getScanRate() {
        return this.scanRate == null ? Input.empty() : this.scanRate;
    }

    public CrawlerDynamodbTargetGetArgs(
        Input<String> path,
        @Nullable Input<Boolean> scanAll,
        @Nullable Input<Double> scanRate) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.scanAll = scanAll;
        this.scanRate = scanRate;
    }

    private CrawlerDynamodbTargetGetArgs() {
        this.path = Input.empty();
        this.scanAll = Input.empty();
        this.scanRate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerDynamodbTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> path;
        private @Nullable Input<Boolean> scanAll;
        private @Nullable Input<Double> scanRate;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerDynamodbTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.scanAll = defaults.scanAll;
    	      this.scanRate = defaults.scanRate;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder scanAll(@Nullable Input<Boolean> scanAll) {
            this.scanAll = scanAll;
            return this;
        }

        public Builder scanAll(@Nullable Boolean scanAll) {
            this.scanAll = Input.ofNullable(scanAll);
            return this;
        }

        public Builder scanRate(@Nullable Input<Double> scanRate) {
            this.scanRate = scanRate;
            return this;
        }

        public Builder scanRate(@Nullable Double scanRate) {
            this.scanRate = Input.ofNullable(scanRate);
            return this;
        }
        public CrawlerDynamodbTargetGetArgs build() {
            return new CrawlerDynamodbTargetGetArgs(path, scanAll, scanRate);
        }
    }
}
