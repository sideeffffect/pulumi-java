// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.location.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRouteCalculatorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteCalculatorArgs Empty = new GetRouteCalculatorArgs();

    @Import(name="calculatorName", required=true)
    private String calculatorName;

    public String calculatorName() {
        return this.calculatorName;
    }

    private GetRouteCalculatorArgs() {}

    private GetRouteCalculatorArgs(GetRouteCalculatorArgs $) {
        this.calculatorName = $.calculatorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteCalculatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteCalculatorArgs $;

        public Builder() {
            $ = new GetRouteCalculatorArgs();
        }

        public Builder(GetRouteCalculatorArgs defaults) {
            $ = new GetRouteCalculatorArgs(Objects.requireNonNull(defaults));
        }

        public Builder calculatorName(String calculatorName) {
            $.calculatorName = calculatorName;
            return this;
        }

        public GetRouteCalculatorArgs build() {
            $.calculatorName = Objects.requireNonNull($.calculatorName, "expected parameter 'calculatorName' to be non-null");
            return $;
        }
    }

}
