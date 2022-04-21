// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1alpha1.inputs.OracleRdbmsResponse;
import java.util.Objects;


/**
 * Oracle data source configuration
 * 
 */
public final class OracleSourceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final OracleSourceConfigResponse Empty = new OracleSourceConfigResponse();

    /**
     * Oracle objects to include in the stream.
     * 
     */
    @Import(name="allowlist", required=true)
    private OracleRdbmsResponse allowlist;

    public OracleRdbmsResponse allowlist() {
        return this.allowlist;
    }

    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    @Import(name="rejectlist", required=true)
    private OracleRdbmsResponse rejectlist;

    public OracleRdbmsResponse rejectlist() {
        return this.rejectlist;
    }

    private OracleSourceConfigResponse() {}

    private OracleSourceConfigResponse(OracleSourceConfigResponse $) {
        this.allowlist = $.allowlist;
        this.rejectlist = $.rejectlist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleSourceConfigResponse $;

        public Builder() {
            $ = new OracleSourceConfigResponse();
        }

        public Builder(OracleSourceConfigResponse defaults) {
            $ = new OracleSourceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowlist(OracleRdbmsResponse allowlist) {
            $.allowlist = allowlist;
            return this;
        }

        public Builder rejectlist(OracleRdbmsResponse rejectlist) {
            $.rejectlist = rejectlist;
            return this;
        }

        public OracleSourceConfigResponse build() {
            $.allowlist = Objects.requireNonNull($.allowlist, "expected parameter 'allowlist' to be non-null");
            $.rejectlist = Objects.requireNonNull($.rejectlist, "expected parameter 'rejectlist' to be non-null");
            return $;
        }
    }

}
