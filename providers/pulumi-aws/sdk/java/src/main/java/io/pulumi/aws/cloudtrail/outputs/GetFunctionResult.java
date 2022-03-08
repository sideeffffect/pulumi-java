// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFunctionResult {
    /**
     * Amazon Resource Name (ARN) identifying your CloudFront Function.
     * 
     */
    private final String arn;
    /**
     * Source code of the function
     * 
     */
    private final String code;
    /**
     * Comment.
     * 
     */
    private final String comment;
    /**
     * ETag hash of the function
     * 
     */
    private final String etag;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * When this resource was last modified.
     * 
     */
    private final String lastModifiedTime;
    private final String name;
    /**
     * Identifier of the function's runtime.
     * 
     */
    private final String runtime;
    private final String stage;
    /**
     * Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"arn","code","comment","etag","id","lastModifiedTime","name","runtime","stage","status"})
    private GetFunctionResult(
        String arn,
        String code,
        String comment,
        String etag,
        String id,
        String lastModifiedTime,
        String name,
        String runtime,
        String stage,
        String status) {
        this.arn = arn;
        this.code = code;
        this.comment = comment;
        this.etag = etag;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.runtime = runtime;
        this.stage = stage;
        this.status = status;
    }

    /**
     * Amazon Resource Name (ARN) identifying your CloudFront Function.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Source code of the function
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * Comment.
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * ETag hash of the function
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * When this resource was last modified.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String getName() {
        return this.name;
    }
    /**
     * Identifier of the function's runtime.
     * 
    */
    public String getRuntime() {
        return this.runtime;
    }
    public String getStage() {
        return this.stage;
    }
    /**
     * Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String code;
        private String comment;
        private String etag;
        private String id;
        private String lastModifiedTime;
        private String name;
        private String runtime;
        private String stage;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.runtime = defaults.runtime;
    	      this.stage = defaults.stage;
    	      this.status = defaults.status;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetFunctionResult build() {
            return new GetFunctionResult(arn, code, comment, etag, id, lastModifiedTime, name, runtime, stage, status);
        }
    }
}
