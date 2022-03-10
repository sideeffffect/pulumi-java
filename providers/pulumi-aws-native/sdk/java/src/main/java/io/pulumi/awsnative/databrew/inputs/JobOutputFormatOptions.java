// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobCsvOutputOptions;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Format options for job Output
 * 
 */
public final class JobOutputFormatOptions extends io.pulumi.resources.InvokeArgs {

    public static final JobOutputFormatOptions Empty = new JobOutputFormatOptions();

    @InputImport(name="csv")
      private final @Nullable JobCsvOutputOptions csv;

    public Optional<JobCsvOutputOptions> getCsv() {
        return this.csv == null ? Optional.empty() : Optional.ofNullable(this.csv);
    }

    public JobOutputFormatOptions(@Nullable JobCsvOutputOptions csv) {
        this.csv = csv;
    }

    private JobOutputFormatOptions() {
        this.csv = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputFormatOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobCsvOutputOptions csv;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputFormatOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
        }

        public Builder csv(@Nullable JobCsvOutputOptions csv) {
            this.csv = csv;
            return this;
        }
        public JobOutputFormatOptions build() {
            return new JobOutputFormatOptions(csv);
        }
    }
}
