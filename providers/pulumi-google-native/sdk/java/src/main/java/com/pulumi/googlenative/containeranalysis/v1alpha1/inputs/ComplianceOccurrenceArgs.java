// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.NonCompliantFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An indication that the compliance checks in the associated ComplianceNote were not satisfied for particular resources or a specified reason.
 * 
 */
public final class ComplianceOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComplianceOccurrenceArgs Empty = new ComplianceOccurrenceArgs();

    /**
     * The reason for non compliance of these files.
     * 
     */
    @Import(name="nonComplianceReason")
    private @Nullable Output<String> nonComplianceReason;

    /**
     * @return The reason for non compliance of these files.
     * 
     */
    public Optional<Output<String>> nonComplianceReason() {
        return Optional.ofNullable(this.nonComplianceReason);
    }

    /**
     * A list of files which are violating compliance checks.
     * 
     */
    @Import(name="nonCompliantFiles")
    private @Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles;

    /**
     * @return A list of files which are violating compliance checks.
     * 
     */
    public Optional<Output<List<NonCompliantFileArgs>>> nonCompliantFiles() {
        return Optional.ofNullable(this.nonCompliantFiles);
    }

    private ComplianceOccurrenceArgs() {}

    private ComplianceOccurrenceArgs(ComplianceOccurrenceArgs $) {
        this.nonComplianceReason = $.nonComplianceReason;
        this.nonCompliantFiles = $.nonCompliantFiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComplianceOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComplianceOccurrenceArgs $;

        public Builder() {
            $ = new ComplianceOccurrenceArgs();
        }

        public Builder(ComplianceOccurrenceArgs defaults) {
            $ = new ComplianceOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nonComplianceReason The reason for non compliance of these files.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceReason(@Nullable Output<String> nonComplianceReason) {
            $.nonComplianceReason = nonComplianceReason;
            return this;
        }

        /**
         * @param nonComplianceReason The reason for non compliance of these files.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceReason(String nonComplianceReason) {
            return nonComplianceReason(Output.of(nonComplianceReason));
        }

        /**
         * @param nonCompliantFiles A list of files which are violating compliance checks.
         * 
         * @return builder
         * 
         */
        public Builder nonCompliantFiles(@Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles) {
            $.nonCompliantFiles = nonCompliantFiles;
            return this;
        }

        /**
         * @param nonCompliantFiles A list of files which are violating compliance checks.
         * 
         * @return builder
         * 
         */
        public Builder nonCompliantFiles(List<NonCompliantFileArgs> nonCompliantFiles) {
            return nonCompliantFiles(Output.of(nonCompliantFiles));
        }

        /**
         * @param nonCompliantFiles A list of files which are violating compliance checks.
         * 
         * @return builder
         * 
         */
        public Builder nonCompliantFiles(NonCompliantFileArgs... nonCompliantFiles) {
            return nonCompliantFiles(List.of(nonCompliantFiles));
        }

        public ComplianceOccurrenceArgs build() {
            return $;
        }
    }

}
