package br.edu.ifrs.riogrande.tads.tds.util.controller.dto;

public class SemanaResponseDTO<T> {
    private T data;
    private String message;
    private boolean success;

    public SemanaResponseDTO() {
    }

    public SemanaResponseDTO(T data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
