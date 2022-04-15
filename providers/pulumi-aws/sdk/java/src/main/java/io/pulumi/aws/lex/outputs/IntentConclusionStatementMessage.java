// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentConclusionStatementMessage {
    /**
     * The text of the message. Must be less than or equal to 1000 characters in length.
     * 
     */
    private final String content;
    /**
     * The content type of the message string.
     * 
     */
    private final String contentType;
    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
     */
    private final @Nullable Integer groupNumber;

    @CustomType.Constructor
    private IntentConclusionStatementMessage(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("groupNumber") @Nullable Integer groupNumber) {
        this.content = content;
        this.contentType = contentType;
        this.groupNumber = groupNumber;
    }

    /**
     * The text of the message. Must be less than or equal to 1000 characters in length.
     * 
    */
    public String content() {
        return this.content;
    }
    /**
     * The content type of the message string.
     * 
    */
    public String contentType() {
        return this.contentType;
    }
    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
    */
    public Optional<Integer> groupNumber() {
        return Optional.ofNullable(this.groupNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentConclusionStatementMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentType;
        private @Nullable Integer groupNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentConclusionStatementMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.groupNumber = defaults.groupNumber;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder groupNumber(@Nullable Integer groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }        public IntentConclusionStatementMessage build() {
            return new IntentConclusionStatementMessage(content, contentType, groupNumber);
        }
    }
}
