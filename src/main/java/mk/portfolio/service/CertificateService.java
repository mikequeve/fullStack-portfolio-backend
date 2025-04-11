package mk.portfolio.service;

import mk.portfolio.model.Certificate;
import mk.portfolio.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService implements ICertificateService{
  @Autowired
  private CertificateRepository certificateRepository;

  @Override
  public List<Certificate> showCertificates() {
    return certificateRepository.findAll();
  }
}
