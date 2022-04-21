// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DataTransferConfigEmailPreferencesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigEmailPreferencesGetArgs Empty = new DataTransferConfigEmailPreferencesGetArgs();

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    @Import(name="enableFailureEmail", required=true)
    private Output<Boolean> enableFailureEmail;

    public Output<Boolean> enableFailureEmail() {
        return this.enableFailureEmail;
    }

    private DataTransferConfigEmailPreferencesGetArgs() {}

    private DataTransferConfigEmailPreferencesGetArgs(DataTransferConfigEmailPreferencesGetArgs $) {
        this.enableFailureEmail = $.enableFailureEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataTransferConfigEmailPreferencesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataTransferConfigEmailPreferencesGetArgs $;

        public Builder() {
            $ = new DataTransferConfigEmailPreferencesGetArgs();
        }

        public Builder(DataTransferConfigEmailPreferencesGetArgs defaults) {
            $ = new DataTransferConfigEmailPreferencesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableFailureEmail(Output<Boolean> enableFailureEmail) {
            $.enableFailureEmail = enableFailureEmail;
            return this;
        }

        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            return enableFailureEmail(Output.of(enableFailureEmail));
        }

        public DataTransferConfigEmailPreferencesGetArgs build() {
            $.enableFailureEmail = Objects.requireNonNull($.enableFailureEmail, "expected parameter 'enableFailureEmail' to be non-null");
            return $;
        }
    }

}
