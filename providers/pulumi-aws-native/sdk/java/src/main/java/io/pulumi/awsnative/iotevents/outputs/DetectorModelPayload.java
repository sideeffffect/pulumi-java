// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DetectorModelPayload {
    /**
     * The content of the payload. You can use a string expression that includes quoted strings (`'<string>'`), variables (`$variable.<variable-name>`), input values (`$input.<input-name>.<path-to-datum>`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
     */
    private final String contentExpression;
    /**
     * The value of the payload type can be either `STRING` or `JSON`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"contentExpression","type"})
    private DetectorModelPayload(
        String contentExpression,
        String type) {
        this.contentExpression = contentExpression;
        this.type = type;
    }

    /**
     * The content of the payload. You can use a string expression that includes quoted strings (`'<string>'`), variables (`$variable.<variable-name>`), input values (`$input.<input-name>.<path-to-datum>`), string concatenations, and quoted strings that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     * 
    */
    public String getContentExpression() {
        return this.contentExpression;
    }
    /**
     * The value of the payload type can be either `STRING` or `JSON`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelPayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentExpression;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelPayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentExpression = defaults.contentExpression;
    	      this.type = defaults.type;
        }

        public Builder setContentExpression(String contentExpression) {
            this.contentExpression = Objects.requireNonNull(contentExpression);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DetectorModelPayload build() {
            return new DetectorModelPayload(contentExpression, type);
        }
    }
}
