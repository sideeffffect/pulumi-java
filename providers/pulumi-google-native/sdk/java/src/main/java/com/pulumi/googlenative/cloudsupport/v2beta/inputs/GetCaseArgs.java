// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsupport.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCaseArgs Empty = new GetCaseArgs();

    @Import(name="caseId", required=true)
    private Output<String> caseId;

    public Output<String> caseId() {
        return this.caseId;
    }

    @Import(name="v2betaId1", required=true)
    private Output<String> v2betaId1;

    public Output<String> v2betaId1() {
        return this.v2betaId1;
    }

    @Import(name="v2betumId", required=true)
    private Output<String> v2betumId;

    public Output<String> v2betumId() {
        return this.v2betumId;
    }

    private GetCaseArgs() {}

    private GetCaseArgs(GetCaseArgs $) {
        this.caseId = $.caseId;
        this.v2betaId1 = $.v2betaId1;
        this.v2betumId = $.v2betumId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCaseArgs $;

        public Builder() {
            $ = new GetCaseArgs();
        }

        public Builder(GetCaseArgs defaults) {
            $ = new GetCaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseId(Output<String> caseId) {
            $.caseId = caseId;
            return this;
        }

        public Builder caseId(String caseId) {
            return caseId(Output.of(caseId));
        }

        public Builder v2betaId1(Output<String> v2betaId1) {
            $.v2betaId1 = v2betaId1;
            return this;
        }

        public Builder v2betaId1(String v2betaId1) {
            return v2betaId1(Output.of(v2betaId1));
        }

        public Builder v2betumId(Output<String> v2betumId) {
            $.v2betumId = v2betumId;
            return this;
        }

        public Builder v2betumId(String v2betumId) {
            return v2betumId(Output.of(v2betumId));
        }

        public GetCaseArgs build() {
            $.caseId = Objects.requireNonNull($.caseId, "expected parameter 'caseId' to be non-null");
            $.v2betaId1 = Objects.requireNonNull($.v2betaId1, "expected parameter 'v2betaId1' to be non-null");
            $.v2betumId = Objects.requireNonNull($.v2betumId, "expected parameter 'v2betumId' to be non-null");
            return $;
        }
    }

}
